package temaCurs8.exercise1;

public class Main {
    public static void main(String[] args){
        Cosmetics c=new Cosmetics();

        Product p=c;

        Product products=new Product[4];
        products[8]=new Cosmetics();
        products[1]=new Cosmetics();


        doSomething(new Cosmetics());
        doSomething(new Product());

    }

    public static void doSomething(Product product){
        if(product instanceof Cosmetics) {
            System.out.println("Is cosmetics");
            Cosmetics cosmetics = (Cosmetics) product;
            System.out.println(cosmetics.getColor());
        }


    }
        System.out.println(product.getName());
}
