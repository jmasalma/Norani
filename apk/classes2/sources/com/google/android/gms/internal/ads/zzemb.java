package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemb implements zzeub {
    public final Context zza;
    public final zzr zzb;
    public final List zzc;

    public zzemb(Context context, zzr zzr, List list) {
        this.zza = context;
        this.zzb = zzr;
        this.zzc = list;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        zzcva zzcva = (zzcva) obj;
        if (((Boolean) zzbfh.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            zzv.zzr();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                        str = runningTaskInfo.topActivity.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", str);
            Bundle bundle2 = new Bundle();
            zzr zzr = this.zzb;
            bundle2.putInt("width", zzr.zze);
            bundle2.putInt("height", zzr.zzb);
            bundle.putBundle("size", bundle2);
            List list = this.zzc;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzcva.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
