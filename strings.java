class strings{
    public static void main(String[] args){
        String first= "Cod";
        String second= "ingal";
        String Codingal= first+second;
        String codingalTrick= "Welcome"+ "to" +"Codingal";
        String codingalCapital= Codingal.toUpperCase();
        String codingalsmall= Codingal.toLowerCase();
        int lengthofcodingal= Codingal.length();
        int lengthofcodingaltrick= codingalTrick.length();
        int sum= lengthofcodingal + lengthofcodingaltrick;
        
        System.out.println(Codingal);
        System.out.println(codingalCapital);
        System.out.println(codingalTrick);
        System.out.println(codingalsmall);
        System.out.println(sum);

    }
}
