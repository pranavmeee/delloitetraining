package collectiondemos;



public class Demo<Z>{
     public void display(Z name){
         System.out.println(name);
}
     public static void main(String[] args) {
         Demo<Integer> d = new Demo<Integer>();
         d.display(122);
         Demo<String>d1 = new Demo<String>();
         d1.display("Ahmed");
}
}


