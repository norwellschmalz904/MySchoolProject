public class MyJavaCode {
    public static void main(String[] args) {
        // Example of an alert dialog
        AlertDialog exampleAlert = new AlertDialog("Hello", "This is a simple alert!");
        
        // Example of a button click event in Java Swing
        JButton clickButton = new JButton("Click Me");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked! Value: " + exampleAlert.getText());
            }
        });
    }
}
