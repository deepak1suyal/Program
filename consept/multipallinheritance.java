
class A{
    int ax=8,bx=8;
  void  fno(){
        System.out.println(ax+bx);
    }
}

/**
 * B
 */
 interface B {final int a=1,b=5;
void fn();

    
}
/*B{
    int a=8,b=8;
  void  fn(){
        System.out.println(a-b);
    }
} */ 

class C extends A implements B{
    int ao=8,bo=8;
 

 public void  fn(){
        System.out.println(ao/bo);
 }

    C(){
        
        ao=80;
System.out.println(a);
    }
}



public class multipallinheritance {
    public static void main(String[] args) {
        
        C c=new C();
        c.fn();
        System.out.println(c.a);
    }
    
}
