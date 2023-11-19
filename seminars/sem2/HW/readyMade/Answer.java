package sem2.HW.readyMade;

//given a sql query string, generate it "where" part, using StringBuilder
// if the value is 'null' then the parameter should not be included in the request

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder stringBuilder = new StringBuilder(QUERY);
        String[] parts = PARAMS.split("[,{}]");
        String[] keyValue;
        boolean hasParams = false;
        for (String item : parts) {
            keyValue = item.split(":");
            if (keyValue.length == 2 && !keyValue[1].equals("\"null\"")) {
                if (hasParams) stringBuilder.append(" and ");
                else hasParams = true;
                stringBuilder.append(keyValue[0].trim().replace("\"", ""));
                stringBuilder.append("='");
                stringBuilder.append(keyValue[1].trim().replace("\"", ""));
                stringBuilder.append("'");
            }
        }
        return stringBuilder;
    }

    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // we can change these values and operator when check it in autotest:
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"null\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"35\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(answer(QUERY, PARAMS));
    }
}