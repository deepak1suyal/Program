package excep;

class ab{
    @SuppressWarnings("finally")
    static int div(int a) throws Exception{
        try {
            return 10/a;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
       
        }
   finally{
         return a/10;
                      }

    }
    public static void main(String[] args) throws Exception{

       System.out.println(div(0)); 

    }
}