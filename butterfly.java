public class butterfly {
    public static void main(String[] args) {
        int n=6;
        //upper loop
        for(int i=1; i<=n; i++){
            //2send haft
            for(int j=1; j<=i; j++){ 
                System.out.print("*");
            }        
        
            //spaces

            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print( " ");
            }

                //2nd part 

                for(int j=1; j<=i;j++){

                    System.out.print("*");
                }
          
          System.out.println();
            }

            //lowe helf gm
             for(int i=n; i>=1; i--){
            //2send haft
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }        
        
            //spaces

            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print( " ");
            }

                //2nd part 

                for(int j=1; j<=i;j++){

                    System.out.print("*");
                }
          
          System.out.println();
            }

        }
    }

