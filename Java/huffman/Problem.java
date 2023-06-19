class Problem {
    public static void main(String[] args) {
        String cadena = "abcd";//a1b1c1d1 8
        boolean b = true;
        int hfLength=0;
        int k=1;
        int i=0;
        while(i<cadena.length()){
            b=true;
            while(b){
            if((i+k)<cadena.length()&&cadena.charAt(i)==cadena.charAt(i+k)){
                k++;
            }else{
                hfLength += 2;
                i+=k;
                k=1;
                b=false; 
            }
               
            }
            
        }
        System.out.println("tamaño de la cadena codificada: "+hfLength);
        System.out.println("tamaño original: "+cadena.length());
    }
}