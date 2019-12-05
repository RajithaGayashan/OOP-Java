class Test18{
    public static void main(String args[]){
        System.out.println("Multipication Table");
        System.out.println("---------------------------------------------------------------------------------");
        for(int i=1;i<13;i++){
            for(int j=1;j<13;j++){
                    int z=i*j;
                    //if(j<=1 && j>=12)
                    System.out.print(" | "+z+" | ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
} 