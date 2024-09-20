package qspyder;

class Hello_World {
    public static void main(String[] args) {
        String s ="I love you in big be";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            String n=arr[i];
            for(int j=0;j<n.length();j=j+2){
                if(j + 1 < n.length()){
                    sb.append(n.charAt(j+1));
                    sb.append(n.charAt(j));
                    
                }else{
                    sb.append(n.charAt(j));
                }
            }    
            sb.append(" ");
        }
        System.out.print(sb.toString().trim()); 
    }
}
