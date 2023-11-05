package sem2.HW.templates;

// given a sql query string, generate it "where" part, using StringBuilder
// if the value is 'null' then the parameter should not be included in the request

class Answer2 {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
        String[] params = paramsNew.split(",");
        StringBuilder stringBuilder = new StringBuilder(QUERY);

        for (int i = 0; i < params.length; i++){
            String[] elements = params[i].replace('"', ' ').split(":");
            if(!"null".equals(elements[1].trim())){
                stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2) stringBuilder.append(" and ");
            }
        }
        return stringBuilder;
    }

    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // we can change these values and operator when check it in autotest:
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Sophie Ellis Bextor\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer2 ans = new Answer2();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}