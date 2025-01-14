public abstract class Shape {
    private String color;
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;

    /** Constructs a Shape instance with only the given color */
    public Shape (String color) {
        this.color = color;
    }
    public Shape()
    {
    }
    /** Constructs a Shape instance with the given values */
    public Shape(String color, double area, double base, double width, double height) {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Overriding method of base class with different implementation
    public abstract void displayshapName();

    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    /** All shapes must provide a method called getArea() */
    public double getArea() {
        // We have a problem here!
        public class Shape {
            private String color;
            protected double area = 1.0;
            protected double base = 1.0;
            protected double width = 1.0;
            protected double height = 1.0;

            /** Constructs a Shape instance with only the given color */
            public Shape (String color) {
                this.color = color;
            }
            public Shape()
            {
            }
            /** Constructs a Shape instance with the given values */
            public Shape(String color, double area, double base, double width, double height) {
                this.color = color;
                this.area = area;
                this.base = base;
                this.width = width;
                this.height = height;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public void setArea(double area) {
                this.area = area;
            }

            public void setBase(double base) {
                this.base = base;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public void setHeight(double height) {
                this.height = height;
            }

            /** Returns a self-descriptive string */
            @Override
            public String toString() {
                return "Shape[color=" + color + "]";
            }

            /** All shapes must provide a method called getArea() */
            public double getArea() {
                // We have a problem here!
                // We need to return some value to compile the program.
                System.out.println("Shape unknown! Cannot compute area!");
                return 0;
            }
            public void displayshapName()
            {
                System.out.println("I am a Shape.");
            }

            public class Circle extends Shape {
                protected double radius;
                private final double PI = Math.PI;

                public Circle(double radius) {
                    this.radius = radius;
                }

                public Circle(double radius, double height) {
                    this.radius = radius;
                    super.height = height;
                }
                public double getArea() {
                    //double area = PI * this.radius * this.radius;
                    super.area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
                    return super.area; //reference to  parent class variable
                }
                @Override
                public void displayshapName() {
                    System.out.println("Drawing a Circle of radius " + this.radius);
                }
                /** Returns a self-descriptive string */
                @Override
                public String toString() {
                    return "Circle[ radius = " + radius + super.toString() + "]";
                }
            }


