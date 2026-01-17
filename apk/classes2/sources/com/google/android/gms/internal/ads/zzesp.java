package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesp implements zzeuc {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    zzesp(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    public final int zza() {
        return 29;
    }

    public final ListenableFuture zzb() {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        PackageManager.NameNotFoundException e;
        String str6 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        if (packageInfo == null) {
            num = null;
        } else {
            num = Integer.valueOf(packageInfo.versionCode);
        }
        if (packageInfo == null) {
            str = null;
        } else {
            str = packageInfo.versionName;
        }
        try {
            Context context = this.zzc;
            zzfrw zzfrw = zzs.zza;
            str2 = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str6));
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznh)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str6);
                    if (installSourceInfo != null) {
                        str4 = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(str4)) {
                                zze.zza("No installing package name found");
                                str4 = null;
                            }
                            str5 = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(str5)) {
                                    zze.zza("No initiating package name found");
                                    str3 = null;
                                    return zzgdn.zzh(new zzesq(str6, num, str, str2, str4, str3));
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                                str3 = str5;
                                return zzgdn.zzh(new zzesq(str6, num, str, str2, str4, str3));
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            e = e3;
                            str5 = null;
                            zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            str3 = str5;
                            return zzgdn.zzh(new zzesq(str6, num, str, str2, str4, str3));
                        }
                        str3 = str5;
                        return zzgdn.zzh(new zzesq(str6, num, str, str2, str4, str3));
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    str4 = null;
                    e = e4;
                    str5 = null;
                    zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                    str3 = str5;
                    return zzgdn.zzh(new zzesq(str6, num, str, str2, str4, str3));
                }
            }
        }
        str4 = null;
        str3 = null;
        return zzgdn.zzh(new zzesq(str6, num, str, str2, str4, str3));
    }
}
