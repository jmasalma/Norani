package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;

public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    private static boolean isComponentEnabled(int i, boolean z) {
        return i == 0 ? z : i == 1;
    }

    private PackageManagerHelper() {
    }

    public static void setComponentEnabled(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        try {
            if (z == isComponentEnabled(getComponentEnabledSetting(context, cls.getName()), false)) {
                Logger.get().debug(TAG, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger.get().debug(TAG, cls.getName() + " " + (z ? str : "disabled"));
        } catch (Exception e) {
            Logger logger = Logger.get();
            String str2 = TAG;
            StringBuilder append = new StringBuilder().append(cls.getName()).append("could not be ");
            if (!z) {
                str = "disabled";
            }
            logger.debug(str2, append.append(str).toString(), e);
        }
    }

    public static boolean isComponentExplicitlyEnabled(Context context, Class<?> cls) {
        return isComponentEnabled(getComponentEnabledSetting(context, cls.getName()), false);
    }

    public static boolean isComponentExplicitlyEnabled(Context context, String str) {
        return getComponentEnabledSetting(context, str) == 1;
    }

    private static int getComponentEnabledSetting(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }
}
