class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for(String str:emails){
            String [] parts = str.split("@");
            String local = parts[0];
            String domain = parts[1];
            
            if(local.contains("+")){
                local = local.substring(0,local.indexOf("+"));
            }
           local= local.replace(".", "");

            String narmlEmail = local + "@" + domain;

            set.add(narmlEmail);
        }
        return set.size();
    }
}