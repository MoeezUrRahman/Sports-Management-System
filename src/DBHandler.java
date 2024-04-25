import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DBHandler {

    private static DatabaseReference databaseRef;
    static  int count=0;
    public DBHandler() {

        try {
            if(count==0)
            {
                FileInputStream refreshToken = new FileInputStream("credentials.json");

                FirebaseOptions options = FirebaseOptions.builder()
                        .setCredentials(GoogleCredentials.fromStream(refreshToken))
                        .setDatabaseUrl("https://equipi-default-rtdb.asia-southeast1.firebasedatabase.app/")
                        .build();

                FirebaseApp.initializeApp(options);
                databaseRef = FirebaseDatabase.getInstance().getReference();
                System.out.println(databaseRef);
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addRecord(String category, String reserverOrLender, String courseID, String date, String name, String reserved) throws InterruptedException {
        DatabaseReference categoryRef = databaseRef.child(category).child(reserverOrLender);

        Map<String, String> record = new HashMap<>();
        record.put("CourseID", courseID);
        record.put("Date", date);
        record.put("Name", name);
        record.put("Reserved", reserved);

        categoryRef.setValue(record, (databaseError, databaseReference) -> {
            System.out.println("Record modified successfully.");
            if (databaseError != null) {
                System.out.println("Error adding record: " + databaseError.getMessage());
            } else {
                System.out.println("Record added successfully.");
            }
        });

        Thread.sleep(5000);
    }

    public void deleteRecord(String category, String reserverOrLender) throws InterruptedException {
        DatabaseReference categoryRef = databaseRef.child(category).child(reserverOrLender);
        categoryRef.removeValue((databaseError, databaseReference) -> {
            if (databaseError != null) {
                System.out.println("Error deleting record: " + databaseError.getMessage());
            } else {
                System.out.println("Record deleted successfully.");
            }
        });
        Thread.sleep(5000);
    }



    public void modifyRecord(String category, String reserverOrLender, String courseID, String date, String name, String reserved) throws InterruptedException {

        DatabaseReference categoryRef = databaseRef.child(category).child(reserverOrLender);

        Map<String, Object> updatedValues = new HashMap<>();
        updatedValues.put("CourseID", courseID);
        updatedValues.put("Date", date);
        updatedValues.put("Name", name);
        updatedValues.put("Reserved", reserved);


        categoryRef.updateChildren(updatedValues, (databaseError, databaseReference) -> {
            if (databaseError != null) {
                System.out.println("Error modifying record: " + databaseError.getMessage());
            } else {
                System.out.println("Record modified successfully.");
            }
        });
        Thread.sleep(5000);


    }

    public static void readCategoryChild(String[] categories) throws InterruptedException, IOException {
        int[] index = {0}; // Create a final array to capture the index value

        if(count == 0)
        {
            FileInputStream refreshToken = new FileInputStream("credentials.json");

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
                    .setDatabaseUrl("https://equipi-default-rtdb.asia-southeast1.firebasedatabase.app/")
                    .build();

            FirebaseApp.initializeApp(options);
            count++;
        }

        databaseRef = FirebaseDatabase.getInstance().getReference();
        System.out.println(databaseRef);

        for (String category : categories) {
            DatabaseReference categoryRef = databaseRef.child(category);
            categoryRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    for (DataSnapshot recordSnapshot : dataSnapshot.getChildren()) {
                        String recordKey = recordSnapshot.getKey();
                        String courseID = recordSnapshot.child("CourseID").getValue(String.class);
                        String date = recordSnapshot.child("Date").getValue(String.class);
                        String name = recordSnapshot.child("Name").getValue(String.class);

                        currentstatus.dbData[index[0]] = courseID;
                        currentstatus.dbData[index[0] + 1] = date;
                        currentstatus.dbData[index[0] + 2] = name;

                        index[0] += 3; // Increment the index value
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    System.out.println("Error reading database: " + databaseError.getMessage());
                }
            });

            Thread.sleep(5000);
        }
    }



    public static void main(String[] args) throws InterruptedException {
        DBHandler dbHandler = new DBHandler();


        /*String category = "Football";
        String reserverOrLender = "Lender";
        String updatedCourseID = "456";
        String updatedDate = "2023-05-29";
        String updatedName = "Alice";
        String updatedReserved = "No";
        dbHandler.modifyRecord(category, reserverOrLender, updatedCourseID, updatedDate, updatedName, updatedReserved);*/


    }
}
