class A extends Thread {
    public void run () {
        for (int i=1;i<=20;i++){
            System.out.println("From thread A,i="+i);
        }
            System.out.println("Exit from thread A");
    }
}
Class B extends Thread {
    public void run (){
        for (int j=20;j<=60;j++){
            System.out.println("From thread B,j=" +j);
        }
        System.out.println("Exits from thread B");
    }
}
Class C extends Thread {
    public void run (){
        for (int k=61;k<=100;k++){
            System.out.println("From thread C,k=" +k);
        }
        System.out.println("Exit from thread C");
    }
}

Class Thread_Test{
    public static void main(String args[]){
        A objA=new A();
        objA.start();
        B objB=new B();
        objB.start();
        C objC=new C();
        objC.start();
    }
}
