package educative;

class Employee {

    // shared variable
    private String name;
    
    
    

    // method is synchronize on 'this' object
    public synchronized void setName(String name) throws InterruptedException  {
        this.name = name;
        System.out.println(this.name);
        wait();
    }

    // also synchronized on the same object
    public synchronized void resetName() {

        this.name = "--";
        System.out.println(this.name);
    }

    // equivalent of adding synchronized in method
    // definition
    public String getName() {
        synchronized (this) {
            return this.name;
        }
    }
    
   

	
    
}
