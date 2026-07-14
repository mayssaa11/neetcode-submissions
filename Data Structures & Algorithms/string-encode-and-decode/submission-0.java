class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append(":").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int pointer = 0;
        while (pointer<str.length()){
            int delimiter_pos = str.indexOf(":", pointer);
            int n = Integer.parseInt(str.substring(pointer, delimiter_pos));
            pointer = delimiter_pos+n+1;
            strs.add(str.substring(delimiter_pos+1, pointer));
        }
        return strs;
    }
}
