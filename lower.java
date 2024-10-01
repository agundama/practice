
    private static class fool {

        public fool() {
        }
    }
public String fool{
    public String name;
    public int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public static void main(String[] args){
    fool f = new fool();
    f.setName("foo");
    System.out.println(f.getName());
}