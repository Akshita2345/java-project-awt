package mainpage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class MainAccess {
    public static void main(String[] args) {
        Frame frame = new Frame("Food Ordering System");
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
 
        // Adding background color
        frame.setBackground(new Color(230, 240, 255));
 
        // Adding a title at the top
        Label title = new Label("Welcome to Food Ordering System");
        title.setAlignment(Label.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBackground(new Color(100, 149, 237)); // Light blue background for title
        title.setForeground(Color.WHITE); // White text
        frame.add(title, BorderLayout.NORTH);
 
        // Adding a panel for buttons
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(2, 1));
        buttonPanel.setBackground(new Color(240, 248, 255));
        // Adding buttons for Customer and Owner
        Button customerButton = new Button("Customer");
        Button ownerButton = new Button("Owner");
        customerButton.setFont(new Font("Arial", Font.PLAIN, 18));
        ownerButton.setFont(new Font("Arial", Font.PLAIN, 18));
 
        // Setting button colors
        customerButton.setBackground(new Color(50, 205, 50)); // Green
        customerButton.setForeground(Color.WHITE); // White text
        ownerButton.setBackground(new Color(255, 69, 0)); // Red
        ownerButton.setForeground(Color.WHITE); // White text
 
        buttonPanel.add(customerButton);
        buttonPanel.add(ownerButton);
        frame.add(buttonPanel, BorderLayout.CENTER);
 
        // Adding a footer
        Label footer = new Label("Choose your role to proceed");
        footer.setAlignment(Label.CENTER);
        footer.setFont(new Font("Arial", Font.ITALIC, 14));
        frame.add(footer, BorderLayout.SOUTH);
 
        frame.setVisible(true);
 
        // Event listeners for buttons
        customerButton.addActionListener(e -> {
            frame.dispose();
            Customer customer = new Customer();
            customer.displayMenu();
        });
 
        ownerButton.addActionListener(e -> {
            frame.dispose();
            Owner owner = new Owner();
            owner.showOptions();
        });
 
        // Close window event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
 
// Customer Class
class Customer {
    static String customerDestination = ""; // To store customer's destination
    static String hotelDesignation = "";   // To store hotel's designation
    static String orderedFood = "";        // To store ordered food
 
    public void displayMenu() {
        Frame frame = new Frame("Menu");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setBackground(new Color(255, 250, 240)); // Light beige
background
 
        // Adding a title
        Label label = new Label("Choose a Hotel:");
        label.setAlignment(Label.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(label, BorderLayout.NORTH);
 
        // Adding buttons for hotel options (A, B, C)
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(3, 1));
 
        Button hotelAButton = new Button("Hotel A");
        Button hotelBButton = new Button("Hotel B");
        Button hotelCButton = new Button("Hotel C");
 
        // Styling buttons
        hotelAButton.setFont(new Font("Arial", Font.PLAIN, 16));
        hotelAButton.setBackground(new Color(255, 165, 0)); // Orange
        hotelAButton.setForeground(Color.WHITE);
 
        hotelBButton.setFont(new Font("Arial", Font.PLAIN, 16));
        hotelBButton.setBackground(new Color(139, 69, 19)); // Brown
        hotelBButton.setForeground(Color.WHITE);
 
        hotelCButton.setFont(new Font("Arial", Font.PLAIN, 16));
        hotelCButton.setBackground(new Color(0, 191, 255)); // Sky blue
        hotelCButton.setForeground(Color.WHITE);
 
        buttonPanel.add(hotelAButton);
buttonPanel.add(hotelBButton);
        buttonPanel.add(hotelCButton);
 
        frame.add(buttonPanel, BorderLayout.CENTER);
 
        // Button functionality
        hotelAButton.addActionListener(e -> {
            hotelDesignation = "Hotel A";
            askFoodOptions();
        });
        hotelBButton.addActionListener(e -> {
            hotelDesignation = "Hotel B";
            askFoodOptions();
        });
        hotelCButton.addActionListener(e -> {
            hotelDesignation = "Hotel C";
            askFoodOptions();
        });
 
        frame.setVisible(true);
 
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
 
    // Method to ask customer for food options
public void askFoodOptions() {
        Frame frame = new Frame("Food Options");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setBackground(new Color(245, 245, 245)); // Light gray background
 
        Label label = new Label("Choose a Food Item:");
        label.setAlignment(Label.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(label, BorderLayout.NORTH);
 
        // Food options (buttons)
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(3, 1));
 
        Button pizzaButton = new Button("Pizza");
        Button burgerButton = new Button("Burger");
        Button drinkButton = new Button("Drink");
 
        pizzaButton.setFont(new Font("Arial", Font.PLAIN, 16));
        pizzaButton.setBackground(new Color(255, 165, 0)); // Orange
        pizzaButton.setForeground(Color.WHITE);
 
        burgerButton.setFont(new Font("Arial", Font.PLAIN, 16));
        burgerButton.setBackground(new Color(139, 69, 19)); // Brown
        burgerButton.setForeground(Color.WHITE);
 
        drinkButton.setFont(new Font("Arial", Font.PLAIN, 16));
        drinkButton.setBackground(new Color(0, 191, 255)); // Sky blue
drinkButton.setForeground(Color.WHITE);
 
        buttonPanel.add(pizzaButton);
        buttonPanel.add(burgerButton);
        buttonPanel.add(drinkButton);
 
        frame.add(buttonPanel, BorderLayout.CENTER);
 
        // Button functionality to capture food choice
        pizzaButton.addActionListener(e -> {
            orderedFood = "Pizza";
            askCustomerDestination();
        });
 
        burgerButton.addActionListener(e -> {
            orderedFood = "Burger";
            askCustomerDestination();
        });
 
        drinkButton.addActionListener(e -> {
            orderedFood = "Drink";
            askCustomerDestination();
        });
 
        frame.setVisible(true);
 
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
 
    // Method to ask Customer's destination
    public void askCustomerDestination() {
        Frame frame = new Frame("Customer Destination");
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());
        frame.setBackground(new Color(245, 245, 245)); // Light gray background
 
        Label label = new Label("Enter your Destination (e.g., Address B):");
        label.setAlignment(Label.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(label, BorderLayout.NORTH);
 
        TextField addressField = new TextField();
        addressField.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(addressField, BorderLayout.CENTER);
 
        Button submitButton = new Button("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 16));
        submitButton.setBackground(new Color(50, 205, 50)); // Green
        submitButton.setForeground(Color.WHITE);
        frame.add(submitButton, BorderLayout.SOUTH);
 
        submitButton.addActionListener(e -> {
            customerDestination = addressField.getText();
            frame.dispose();
            confirmOrder();
        });
 
        frame.setVisible(true);
 
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
 
    // Method to confirm order
    public void confirmOrder() {
        Frame frame = new Frame("Order Confirmation");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3, 1));
        frame.setBackground(new Color(245, 245, 245)); // Light gray background
 
        Label label = new Label("Proceed with order at " + hotelDesignation + " for delivery to " + customerDestination + "?");
        label.setAlignment(Label.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(label);
 
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
 
        yesButton.setFont(new Font("Arial", Font.PLAIN, 16));
        noButton.setFont(new Font("Arial", Font.PLAIN, 16));
        yesButton.setBackground(new Color(50, 205, 50)); // Green
        noButton.setBackground(new Color(255, 69, 0)); // Red
 
        yesButton.setForeground(Color.WHITE);
        noButton.setForeground(Color.WHITE);
 
        Panel buttonPanel = new Panel();
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
 
        frame.add(buttonPanel);
 
        // Handling responses
        yesButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Order Processed!");
            frame.dispose();
            // Back to main menu
            MainAccess.main(new String[]{});
        });
 
        noButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Order Cancelled!");
            frame.dispose();
            // Back to main menu
            MainAccess.main(new String[]{});
        });
 
        frame.setVisible(true);
 
        frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
 
// Owner Class
class Owner {
    public void showOptions() {
        Frame frame = new Frame("Owner Portal");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(2, 1));
        frame.setBackground(new Color(255, 250, 240)); // Light beige background
 
        Label label = new Label("Owner Portal");
        label.setAlignment(Label.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(label);
 
        // Adding buttons for Owner to view or track orders
        Button viewOrdersButton = new Button("View Orders");
        Button trackOrdersButton = new Button("Track Orders");
 
        // Button styling
        viewOrdersButton.setFont(new Font("Arial", Font.PLAIN, 16));
        viewOrdersButton.setBackground(new Color(70, 130, 180)); // Steel blue
        viewOrdersButton.setForeground(Color.WHITE);
trackOrdersButton.setFont(new Font("Arial", Font.PLAIN, 16));
        trackOrdersButton.setBackground(new Color(70, 130, 180)); // Steel blue
        trackOrdersButton.setForeground(Color.WHITE);
 
        frame.add(viewOrdersButton);
        frame.add(trackOrdersButton);
 
        // View Orders - display the ordered food along with destinations
        viewOrdersButton.addActionListener(e -> {
            String orderInfo = "Food Ordered: " + Customer.orderedFood
                    + "\nCustomer Destination: " + Customer.customerDestination
                    + "\nHotel Designation: " + Customer.hotelDesignation;
            JOptionPane.showMessageDialog(frame, orderInfo);
        });
 
        // Track Orders - display tracking info
        trackOrdersButton.addActionListener(e -> {
            String trackingInfo = "Tracking Order:\nFrom: " + Customer.hotelDesignation
                    + "\nTo: " + Customer.customerDestination;
            JOptionPane.showMessageDialog(frame, trackingInfo);
        });
 
        frame.setVisible(true);
 
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}





