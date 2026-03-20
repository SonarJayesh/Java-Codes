public class ThisKeyordDemo {
    
    int a,b;

     public void setData(int a, int b){

        this.a = a;
        this.b = b;

    }

    public void getData(){
        System.out.println("A= "+this.a+"\t B="+this.b);
        System.out.println();
        
    }
   
    public static void main(String[] args) {
        ThisKeyordDemo thisKeyordDemo = new ThisKeyordDemo();
        thisKeyordDemo.setData(10, 20);
        thisKeyordDemo.getData();

    }
}
