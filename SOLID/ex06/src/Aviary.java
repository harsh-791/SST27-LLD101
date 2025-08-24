class Aviary {public 
    void release(Flyable b){ b.fly(); System.out.println("Flying bird Released"); }
    void release(Swimmable b) {
        b.swim(); 
        System.out.println("Swimming bird Released");
    }
}