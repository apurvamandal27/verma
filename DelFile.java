//Some change is done
import java.io.File;
public class DelFile {
    public static void main(String[] args) {
		String s="C:\\Users\\apurva\\Desktop";
		System.out.println("Some changes");
		
        /*File f=new File("C:\\Users\\apurva\\Desktop");
        File[]arr=f.listFiles();
        for(File fl:arr){
            if(fl.getName().endsWith(".txt")){
                if(fl.length()!=0){
                    fl.delete();
                    System.out.println(fl.getName()+"  is deleted");
                }
            }
        }*/
    }
}pkpharma@yahoo.com
<LinearLayout android:layout_height="match_parent"
        android:layout_width="match_parent"
        android:orientation="horizontal"
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        >
        <LinearLayout
            android:layout_weight="1"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:orientation="vertical">
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Team A"
                android:textSize="45dp"
                android:gravity="center_horizontal"
                android:padding="4dp"/>
    
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="0"
                android:textSize="45dp"
                android:gravity="center_horizontal"
                android:padding="4dp"
                android:id="@+id/team_a_score"/>
    
            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="+3 Points"
                android:textSize="20dp"
                android:layout_margin="8dp"
                android:onClick="incrementThreeForA"/>
    
            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="+2 Points"
                android:textSize="20dp"
                android:layout_margin="8dp"
                android:onClick="incrementTwoForA"/>
    
            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Free Throw"
                android:textSize="20dp"
                android:layout_margin="8dp"
                android:onClick="incrementOneForA"/>
        </LinearLayout>
    
        <LinearLayout
            android:layout_weight="1"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:orientation="vertical">
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Team B"
                android:textSize="45dp"
                android:gravity="center_horizontal"
                android:padding="4dp"/>
    
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="0"
                android:textSize="45dp"
                android:gravity="center_horizontal"
                android:padding="4dp"
                android:id="@+id/team_b_score"/>
    
            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="+3 Points"
                android:textSize="20dp"
                android:layout_margin="8dp"
                android:onClick="incrementThreeForB"/>
    
            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="+2 Points"
                android:textSize="20dp"
                android:layout_margin="8dp"
                android:onClick="incrementTwoForB"/>
    
            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Free Throw"
                android:textSize="20dp"
                android:layout_margin="8dp"
                android:onClick="incrementOneForB"/>
        </LinearLayout>
    
    </LinearLayout>