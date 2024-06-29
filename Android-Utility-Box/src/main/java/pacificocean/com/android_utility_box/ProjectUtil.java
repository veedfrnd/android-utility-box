package pacificocean.com.android_utility_box;



import android.content.Context;
import android.widget.Toast;

public class ProjectUtil {
    public static void getAppPackage(Context context) {
        String packageName = context.getPackageName();
        Toast.makeText(context, packageName, Toast.LENGTH_SHORT).show();
    }
}
