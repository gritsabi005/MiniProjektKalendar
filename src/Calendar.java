import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Calendar implements ActionListener{
    private JFrame frame;
    private JPanel monday, tuesday, wednesday, thursday, friday, saturday, sunday;
    private JLabel dateOnMonday, dateOnTuesday, dateOnWednesday, dateOnThursday, dateOnFriday, dateOnSaturday, dateOnSunday;
    private JLabel sizeableEventsMonday, sizeableEventsTuesday, sizeableEventsWednesday, sizeableEventsThursday, sizeableEventsFriday, sizeableEventsSaturday, sizeableEventsSunday;
    private JTextField writeYourEventsMonday, writeYourEventsTuesday, writeYourEventsWednesday, writeYourEventsThursday, writeYourEventsFriday, writeYourEventsSaturday, writeYourEventsSunday;
    private JButton createEventsMonday, createEventsTuesday, createEventsWednesday, createEventsThursday, createEventsFriday, createEventsSaturday, createEventsSunday;


    public Calendar(){ // You create gridLayout that consists in each borderLayout
        // Creating window

        frame = new JFrame("Mini Calendar");
        frame.setSize(1000, 800);
        frame.setLayout(new GridLayout(1, 7, 10, 10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        monday = new JPanel();
        frame.add(monday);

        tuesday = new JPanel();
        frame.add(tuesday);

        wednesday = new JPanel();
        frame.add(wednesday);

        thursday = new JPanel();
        frame.add(thursday);

        friday = new JPanel();
        frame.add(friday);

        saturday = new JPanel();
        frame.add(saturday);

        sunday = new JPanel();
        frame.add(sunday);

        frame.setVisible(true);

        // Make Column for Monday
        // Monday 13 Oktober as label put in on the north
        // Addable Label on the center using if later in the actionPerformed
        // TextField for creating an event in the south
        // Button to put the textfield in the addable label in the south

        monday.setLayout(new BorderLayout());

        dateOnMonday = new JLabel("MONDAY");
        monday.add(dateOnMonday, BorderLayout.NORTH);

        sizeableEventsMonday = new JLabel();
        monday.add(sizeableEventsMonday, BorderLayout.CENTER);

        JPanel combinationofTexfielAndButtonMonday = new JPanel();
        monday.add(combinationofTexfielAndButtonMonday, BorderLayout.SOUTH);
        combinationofTexfielAndButtonMonday.setLayout(new BorderLayout());

        writeYourEventsMonday = new JTextField();
        combinationofTexfielAndButtonMonday.add(writeYourEventsMonday, BorderLayout.NORTH);

        createEventsMonday = new JButton("Skapa");
        combinationofTexfielAndButtonMonday.add(createEventsMonday, BorderLayout.SOUTH);
        createEventsMonday.addActionListener((ActionListener) this);

        monday.setBorder(new EmptyBorder(7, 7, 7, 7));


        // Tuesday
        tuesday.setLayout(new BorderLayout());

        dateOnTuesday = new JLabel("TUESDAY");
        tuesday.add(dateOnTuesday, BorderLayout.NORTH);

        sizeableEventsTuesday = new JLabel();
        tuesday.add(sizeableEventsTuesday, BorderLayout.CENTER);

        JPanel combinationofTexfielAndButtonTuesday = new JPanel();
        tuesday.add(combinationofTexfielAndButtonTuesday, BorderLayout.SOUTH);
        combinationofTexfielAndButtonTuesday.setLayout(new BorderLayout());

        writeYourEventsTuesday = new JTextField();
        combinationofTexfielAndButtonTuesday.add(writeYourEventsTuesday, BorderLayout.NORTH);

        createEventsTuesday = new JButton("Skapa");
        combinationofTexfielAndButtonTuesday.add(createEventsTuesday, BorderLayout.SOUTH);
        createEventsTuesday.addActionListener((ActionListener) this);

        tuesday.setBorder(new EmptyBorder(7, 7,7 ,7));

        // Wednesday
        wednesday.setLayout(new BorderLayout());

        dateOnWednesday = new JLabel("WEDNESDAY");
        wednesday.add(dateOnWednesday, BorderLayout.NORTH);

        sizeableEventsWednesday = new JLabel();
        wednesday.add(sizeableEventsWednesday, BorderLayout.CENTER);

        JPanel combinationofTexfielAndButtonWednesday = new JPanel();
        wednesday.add(combinationofTexfielAndButtonWednesday, BorderLayout.SOUTH);
        combinationofTexfielAndButtonWednesday.setLayout(new BorderLayout());

        writeYourEventsWednesday = new JTextField();
        combinationofTexfielAndButtonWednesday.add(writeYourEventsWednesday, BorderLayout.NORTH);

        createEventsWednesday = new JButton("Skapa");
        combinationofTexfielAndButtonWednesday.add(createEventsWednesday, BorderLayout.SOUTH);
        createEventsWednesday.addActionListener((ActionListener) this);

        wednesday.setBorder(new EmptyBorder(7, 7,7 ,7));

        // Thursday


        thursday.setLayout(new BorderLayout());

        dateOnThursday = new JLabel("THURSDAY");
        thursday.add(dateOnThursday, BorderLayout.NORTH);

        sizeableEventsThursday = new JLabel();
        thursday.add(sizeableEventsThursday, BorderLayout.CENTER);

        JPanel combinationofTexfielAndButtonThursday = new JPanel();
        thursday.add(combinationofTexfielAndButtonThursday, BorderLayout.SOUTH);
        combinationofTexfielAndButtonThursday.setLayout(new BorderLayout());

        writeYourEventsThursday = new JTextField();
        combinationofTexfielAndButtonThursday.add(writeYourEventsThursday, BorderLayout.NORTH);

        createEventsThursday = new JButton("Skapa");
        combinationofTexfielAndButtonThursday.add(createEventsThursday, BorderLayout.SOUTH);
        createEventsThursday.addActionListener((ActionListener) this);

        thursday.setBorder(new EmptyBorder(7, 7,7 ,7));

        // Friday
        friday.setLayout(new BorderLayout());

        dateOnFriday = new JLabel("FRIDAY");
        friday.add(dateOnFriday, BorderLayout.NORTH);

        sizeableEventsFriday = new JLabel();
        friday.add(sizeableEventsFriday, BorderLayout.CENTER);

        JPanel combinationofTexfielAndButtonFriday = new JPanel();
        friday.add(combinationofTexfielAndButtonFriday, BorderLayout.SOUTH);
        combinationofTexfielAndButtonFriday.setLayout(new BorderLayout());

        writeYourEventsFriday = new JTextField();
        combinationofTexfielAndButtonFriday.add(writeYourEventsFriday, BorderLayout.NORTH);

        createEventsFriday = new JButton("Skapa");
        combinationofTexfielAndButtonFriday.add(createEventsFriday, BorderLayout.SOUTH);
        createEventsFriday.addActionListener((ActionListener) this);

        friday.setBorder(new EmptyBorder(7, 7,7 ,7));

        // Saturday
        saturday.setLayout(new BorderLayout());

        dateOnSaturday = new JLabel("SATURDAY");
        saturday.add(dateOnSaturday, BorderLayout.NORTH);

        sizeableEventsSaturday = new JLabel();
        saturday.add(sizeableEventsSaturday, BorderLayout.CENTER);

        JPanel combinationofTexfielAndButtonSaturday = new JPanel();
        saturday.add(combinationofTexfielAndButtonSaturday, BorderLayout.SOUTH);
        combinationofTexfielAndButtonSaturday.setLayout(new BorderLayout());

        writeYourEventsSaturday = new JTextField();
        combinationofTexfielAndButtonSaturday.add(writeYourEventsSaturday, BorderLayout.NORTH);

        createEventsSaturday = new JButton("Skapa");
        combinationofTexfielAndButtonSaturday.add(createEventsSaturday, BorderLayout.SOUTH);
        createEventsSaturday.addActionListener((ActionListener) this);

        saturday.setBorder(new EmptyBorder(7, 7,7 ,7));

        // Sunday
        sunday.setLayout(new BorderLayout());

        dateOnSunday = new JLabel("SUNDAY");
        sunday.add(dateOnSunday, BorderLayout.NORTH);

        sizeableEventsSunday = new JLabel();
        sunday.add(sizeableEventsSunday, BorderLayout.CENTER);

        JPanel combinationofTexfielAndButtonSunday = new JPanel();
        sunday.add(combinationofTexfielAndButtonSunday, BorderLayout.SOUTH);
        combinationofTexfielAndButtonSunday.setLayout(new BorderLayout());

        writeYourEventsSunday = new JTextField();
        combinationofTexfielAndButtonSunday.add(writeYourEventsSunday, BorderLayout.NORTH);

        createEventsSunday = new JButton("Skapa");
        combinationofTexfielAndButtonSunday.add(createEventsSunday, BorderLayout.SOUTH);
        createEventsSunday.addActionListener((ActionListener) this);

        sunday.setBorder(new EmptyBorder(7, 7,7 ,7));

        Days days = new Days();
        //creating the panels in arrays from all the variables above,
        JPanel[] calendarPanels = {monday, tuesday, wednesday, thursday, friday, saturday, sunday}; // will be used to locate the days
        JLabel[] calendarLabels = {dateOnMonday, dateOnTuesday, dateOnWednesday, dateOnThursday, dateOnFriday, dateOnSaturday, dateOnSunday}; // will be used to present a specific visual presentation when it is the day
        days.getThisWeekDate(calendarPanels, calendarLabels);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        JButton clickedButton = (JButton) e.getSource();
        // Monday
        if (clickedButton == createEventsMonday){
            if (writeYourEventsMonday.getText().isEmpty()) {
                String addEventMonday = writeYourEventsMonday.getText();
                sizeableEventsMonday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + addEventMonday + "</div>"); // creating the format of the event activities in html style to edit and to paraphrase
                writeYourEventsMonday.setText("");
            }
            else {
                String existingEventMonday = sizeableEventsMonday.getText();
                String addEventMonday = writeYourEventsMonday.getText();
                sizeableEventsMonday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + existingEventMonday + "<br>" + addEventMonday + "</div>");
                writeYourEventsMonday.setText("");
            }
        }
        // Tuesday
        if (clickedButton == createEventsTuesday){
            if (writeYourEventsTuesday.getText().isEmpty()) {
                String addEventTuesday = writeYourEventsTuesday.getText();
                sizeableEventsTuesday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + addEventTuesday+ "</div>");
                writeYourEventsTuesday.setText("");
            }
            else {
                String existingEventTuesday = sizeableEventsTuesday.getText();
                String addEventTuesday = writeYourEventsTuesday.getText();
                sizeableEventsTuesday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + existingEventTuesday + "<br>" + addEventTuesday + "</div>");
                writeYourEventsTuesday.setText("");
            }
        }
        // Wednesday
        if (clickedButton == createEventsWednesday){
            if (writeYourEventsWednesday.getText().isEmpty()) {
                String addEventWednesday = writeYourEventsWednesday.getText();
                sizeableEventsWednesday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + addEventWednesday + "</div>");
                writeYourEventsWednesday.setText("");
            }
            else {
                String existingEventWednesday = sizeableEventsWednesday.getText();
                String addEventWednesday = writeYourEventsWednesday.getText();
                sizeableEventsWednesday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + existingEventWednesday + "<br>" + addEventWednesday + "</div>");
                writeYourEventsWednesday.setText("");
            }
        }

        // Thursday
        if (clickedButton == createEventsThursday){
            if (writeYourEventsThursday.getText().isEmpty()) {
                String addEventThursday = writeYourEventsThursday.getText();
                sizeableEventsThursday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + addEventThursday + "</div>");
                writeYourEventsThursday.setText("");
            }
            else {
                String existingEventThursday = sizeableEventsThursday.getText();
                String addEventThursday = writeYourEventsThursday.getText();
                sizeableEventsThursday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + existingEventThursday + "<br>" + addEventThursday + "</div>");
                writeYourEventsThursday.setText("");
            }
        }

        // Friday
        if (clickedButton == createEventsFriday){
            if (writeYourEventsFriday.getText().isEmpty()) {
                String addEventFriday = writeYourEventsFriday.getText();
                sizeableEventsFriday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + addEventFriday + "</div>");
                writeYourEventsFriday.setText("");
            }
            else {
                String existingEventFriday = sizeableEventsFriday.getText();
                String addEventFriday = writeYourEventsFriday.getText();
                sizeableEventsFriday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + existingEventFriday + "<br>" + addEventFriday + "</div>");
                writeYourEventsFriday.setText("");
            }
        }

        // Saturday
        if (clickedButton == createEventsSaturday){
            if (writeYourEventsSaturday.getText().isEmpty()) {
                String addEventSaturday = writeYourEventsSaturday.getText();
                sizeableEventsSaturday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + addEventSaturday + "</div>");
                writeYourEventsSaturday.setText("");
            }
            else {
                String existingEventSaturday = sizeableEventsSaturday.getText();
                String addEventSaturday = writeYourEventsSaturday.getText();
                sizeableEventsSaturday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + existingEventSaturday + "<br>" + addEventSaturday + "</div>");
                writeYourEventsSaturday.setText("");
            }
        }

        // Sunday
        if (clickedButton == createEventsSunday){
            if (writeYourEventsSunday.getText().isEmpty()) {
                String addEventSunday = writeYourEventsSunday.getText();
                sizeableEventsSunday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + addEventSunday + "</div>");
                writeYourEventsSunday.setText("");
            }
            else {
                String existingEventSunday = sizeableEventsSunday.getText();
                String addEventSunday = writeYourEventsSunday.getText();
                sizeableEventsSunday.setText("<html><div style='text-align: center; width: 100%; word-wrap: break-word;'>" + existingEventSunday + "<br>" + addEventSunday + "</div>");
                writeYourEventsSunday.setText("");
            }
        }
        frame.revalidate();
        frame.repaint();
    }
}