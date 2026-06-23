package Exercise5_Decorator;



public class Main {

    interface Coffee {
        String getDescription();
        int getCost();
    }

    static class SimpleCoffee implements Coffee {

        public String getDescription() {
            return "Simple Coffee";
        }

        public int getCost() {
            return 100;
        }
    }

    static class MilkDecorator implements Coffee {

        private Coffee coffee;

        public MilkDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        public String getDescription() {
            return coffee.getDescription() + ", Milk";
        }

        public int getCost() {
            return coffee.getCost() + 20;
        }
    }

    static class ChocolateDecorator implements Coffee {

        private Coffee coffee;

        public ChocolateDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        public String getDescription() {
            return coffee.getDescription() + ", Chocolate";
        }

        public int getCost() {
            return coffee.getCost() + 30;
        }
    }

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);

        coffee = new ChocolateDecorator(coffee);

        System.out.println("Description: " +
                coffee.getDescription());

        System.out.println("Cost: ₹" +
                coffee.getCost());
    }
}
