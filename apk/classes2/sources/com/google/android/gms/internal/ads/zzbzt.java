package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbzt {
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    final String zzf;
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;
    private final Object zzj = new Object();
    private final zzg zzk;

    public zzbzt(String str, zzg zzg2) {
        this.zzf = str;
        this.zzk = zzg2;
    }

    private final void zzi() {
        if (((Boolean) zzbfl.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzj) {
            i = this.zzi;
        }
        return i;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            bundle = new Bundle();
            if (!this.zzk.zzN()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza2 = zzbwa.zza(context);
            int identifier = zza2.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                int i = zze.zza;
                zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza2.getPackageManager().getActivityInfo(new ComponentName(zza2.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z = true;
                    } else {
                        int i2 = zze.zza;
                        zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    int i3 = zze.zza;
                    zzo.zzj("Fail to fetch AdActivity theme");
                    zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
            bundle.putInt("consent_form_action_identifier", zza());
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(com.google.android.gms.ads.internal.client.zzm r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.zzj
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.zzg r1 = r10.zzk     // Catch:{ all -> 0x007f }
            long r2 = r1.zzd()     // Catch:{ all -> 0x007f }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ all -> 0x007f }
            long r4 = r4.currentTimeMillis()     // Catch:{ all -> 0x007f }
            long r6 = r10.zzb     // Catch:{ all -> 0x007f }
            r8 = -1
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            long r2 = r4 - r2
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzbh     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x007f }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ all -> 0x007f }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x007f }
            long r6 = r6.longValue()     // Catch:{ all -> 0x007f }
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0033
            r2 = -1
            r10.zzd = r2     // Catch:{ all -> 0x007f }
            goto L_0x0039
        L_0x0033:
            int r2 = r1.zzc()     // Catch:{ all -> 0x007f }
            r10.zzd = r2     // Catch:{ all -> 0x007f }
        L_0x0039:
            r10.zzb = r12     // Catch:{ all -> 0x007f }
            r10.zza = r12     // Catch:{ all -> 0x007f }
            goto L_0x0040
        L_0x003e:
            r10.zza = r12     // Catch:{ all -> 0x007f }
        L_0x0040:
            com.google.android.gms.internal.ads.zzbcv r12 = com.google.android.gms.internal.ads.zzbde.zzdS     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.zzbdc r13 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x007f }
            java.lang.Object r12 = r13.zzb(r12)     // Catch:{ all -> 0x007f }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x007f }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x007f }
            r13 = 1
            if (r12 != 0) goto L_0x0062
            android.os.Bundle r11 = r11.zzc     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0062
            java.lang.String r12 = "gw"
            r2 = 2
            int r11 = r11.getInt(r12, r2)     // Catch:{ all -> 0x007f }
            if (r11 != r13) goto L_0x0062
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x0062:
            int r11 = r10.zzc     // Catch:{ all -> 0x007f }
            int r11 = r11 + r13
            r10.zzc = r11     // Catch:{ all -> 0x007f }
            int r11 = r10.zzd     // Catch:{ all -> 0x007f }
            int r11 = r11 + r13
            r10.zzd = r11     // Catch:{ all -> 0x007f }
            if (r11 != 0) goto L_0x0076
            r11 = 0
            r10.zze = r11     // Catch:{ all -> 0x007f }
            r1.zzz(r4)     // Catch:{ all -> 0x007f }
            goto L_0x007d
        L_0x0076:
            long r11 = r1.zze()     // Catch:{ all -> 0x007f }
            long r4 = r4 - r11
            r10.zze = r4     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x007f:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzt.zzg(com.google.android.gms.ads.internal.client.zzm, long):void");
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
