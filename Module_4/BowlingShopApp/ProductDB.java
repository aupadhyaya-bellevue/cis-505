/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

public class ProductDB {
    /**
     * Method returns list of products based on the code, if an unknow code is requested, it will return an empty list
     * @param code String
     * @return list GenericQueue<Product>
     */
    public static GenericQueue<Product> getProducts(String code) {
        // Initialize product list with empty products
        GenericQueue<Product> queue = new GenericQueue<>();

        if("b".equalsIgnoreCase(code)) { // Check if requested products are balls
            Ball ball = new Ball();
            ball.setCode("B100");
            ball.setDescription("Black Widow 2.0");
            ball.setPrice(144.95);
            ball.setColor("Black and Red");
            queue.enqueue(ball);

            ball = new Ball();
            ball.setCode("B200");
            ball.setDescription("Axiom Pearl");
            ball.setPrice(154.95);
            ball.setColor("Blue and Red");
            queue.enqueue(ball);

            ball = new Ball();
            ball.setCode("B300");
            ball.setDescription("Proton Physix");
            ball.setPrice(174.95);
            ball.setColor("Pink and Purple");
            queue.enqueue(ball);

            ball = new Ball();
            ball.setCode("B400");
            ball.setDescription("Force Unleashed");
            ball.setPrice(139.99);
            ball.setColor("Red and White");
            queue.enqueue(ball);

            ball = new Ball();
            ball.setCode("B500");
            ball.setDescription("Phaze III");
            ball.setPrice(154.99);
            ball.setColor("Purple and Green");
            queue.enqueue(ball);
        } else if("a".equalsIgnoreCase(code)) { // Check if requested products are bags
            Bag bag = new Bag();
            bag.setCode("A100");
            bag.setDescription("Path Pro Deluxe");
            bag.setPrice(34.99);
            bag.setType("Single");
            queue.enqueue(bag);

            bag = new Bag();
            bag.setCode("A200");
            bag.setDescription("Prime Roller Black/Royal Blue");
            bag.setPrice(54.99);
            bag.setType("Double");
            queue.enqueue(bag);

            bag = new Bag();
            bag.setCode("A300");
            bag.setDescription("Silver/Royal Blue");
            bag.setPrice(74.99);
            bag.setType("Triple");
            queue.enqueue(bag);
        } else if("s".equalsIgnoreCase(code)) { // Check if requested products are shoes
            Shoe shoe = new Shoe();
            shoe.setCode("S100");
            shoe.setDescription("Men's Ram Black");
            shoe.setPrice(39.99);
            shoe.setSize(10.5);
            queue.enqueue(shoe);

            shoe = new Shoe();
            shoe.setCode("S200");
            shoe.setDescription("Women's Rise Black/Hot Pink");
            shoe.setPrice(39.99);
            shoe.setSize(7.0);
            queue.enqueue(shoe);

            shoe = new Shoe();
            shoe.setCode("S300");
            shoe.setDescription("Women's Path Lite Seamless Mesh");
            shoe.setPrice(54.99);
            shoe.setSize(6.0);
            queue.enqueue(shoe);

            shoe = new Shoe();
            shoe.setCode("S400");
            shoe.setDescription("Men's Tribal White");
            shoe.setPrice(26.99);
            shoe.setSize(8.5);
            queue.enqueue(shoe);

            shoe = new Shoe();
            shoe.setCode("S500");
            shoe.setDescription("Youth Skull Green/Black");
            shoe.setPrice(39.99);
            shoe.setSize(3.0);
            queue.enqueue(shoe);
        }

        return queue;
    }    
}
