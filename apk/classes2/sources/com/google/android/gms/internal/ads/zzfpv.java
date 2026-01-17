package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfpv {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfpv(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfpw.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfpw.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final String zzf() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzayp r9, com.google.android.gms.internal.ads.zzfqb r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzays r0 = r9.zzc()
            java.lang.String r0 = r0.zzk()
            com.google.android.gms.internal.ads.zzgxz r1 = r9.zzf()
            byte[] r1 = r1.zzA()
            com.google.android.gms.internal.ads.zzgxz r2 = r9.zzd()
            byte[] r2 = r2.zzA()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x0177
            if (r2 == 0) goto L_0x0177
            int r3 = r2.length
            if (r3 != 0) goto L_0x0026
            goto L_0x0177
        L_0x0026:
            java.io.File r3 = r8.zza
            com.google.android.gms.internal.ads.zzfpw.zzd(r3)
            r3.mkdirs()
            java.io.File r5 = com.google.android.gms.internal.ads.zzfpw.zzc(r0, r3)
            r5.mkdirs()
            java.lang.String r5 = "pcam.jar"
            java.io.File r6 = com.google.android.gms.internal.ads.zzfpw.zzb(r0, r5, r3)
            if (r1 == 0) goto L_0x0046
            int r7 = r1.length
            if (r7 <= 0) goto L_0x0046
            boolean r1 = com.google.android.gms.internal.ads.zzfpw.zze(r6, r1)
            if (r1 == 0) goto L_0x0177
        L_0x0046:
            java.lang.String r1 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.zzfpw.zzb(r0, r1, r3)
            boolean r0 = com.google.android.gms.internal.ads.zzfpw.zze(r0, r2)
            if (r0 == 0) goto L_0x0177
            com.google.android.gms.internal.ads.zzays r0 = r9.zzc()
            java.lang.String r0 = r0.zzk()
            java.io.File r0 = com.google.android.gms.internal.ads.zzfpw.zzb(r0, r5, r3)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x006e
            if (r10 == 0) goto L_0x006e
            boolean r10 = r10.zza(r0)
            if (r10 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            return r4
        L_0x006e:
            com.google.android.gms.internal.ads.zzays r10 = r9.zzc()
            java.lang.String r10 = r10.zzk()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r2 = 1
            if (r0 == 0) goto L_0x0080
        L_0x007d:
            r9 = r4
            goto L_0x0131
        L_0x0080:
            java.io.File r0 = com.google.android.gms.internal.ads.zzfpw.zzb(r10, r5, r3)
            java.io.File r3 = com.google.android.gms.internal.ads.zzfpw.zzb(r10, r1, r3)
            java.io.File r6 = r8.zzd()
            java.io.File r5 = com.google.android.gms.internal.ads.zzfpw.zzb(r10, r5, r6)
            java.io.File r6 = r8.zzd()
            java.io.File r10 = com.google.android.gms.internal.ads.zzfpw.zzb(r10, r1, r6)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x00a5
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto L_0x00a5
            goto L_0x007d
        L_0x00a5:
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x007d
            boolean r10 = r3.renameTo(r10)
            if (r10 == 0) goto L_0x007d
            com.google.android.gms.internal.ads.zzayq r10 = com.google.android.gms.internal.ads.zzays.zzd()
            com.google.android.gms.internal.ads.zzays r0 = r9.zzc()
            java.lang.String r0 = r0.zzk()
            r10.zze(r0)
            com.google.android.gms.internal.ads.zzays r0 = r9.zzc()
            java.lang.String r0 = r0.zzj()
            r10.zza(r0)
            com.google.android.gms.internal.ads.zzays r0 = r9.zzc()
            long r0 = r0.zza()
            r10.zzb(r0)
            com.google.android.gms.internal.ads.zzays r0 = r9.zzc()
            long r0 = r0.zzc()
            r10.zzd(r0)
            com.google.android.gms.internal.ads.zzays r9 = r9.zzc()
            long r0 = r9.zzb()
            r10.zzc(r0)
            com.google.android.gms.internal.ads.zzgzh r9 = r10.zzbr()
            com.google.android.gms.internal.ads.zzays r9 = (com.google.android.gms.internal.ads.zzays) r9
            com.google.android.gms.internal.ads.zzays r10 = r8.zzb(r2)
            android.content.SharedPreferences r0 = r8.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r10 == 0) goto L_0x011b
            java.lang.String r1 = r9.zzk()
            java.lang.String r3 = r10.zzk()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x011b
            java.lang.String r1 = r8.zze()
            byte[] r10 = r10.zzaV()
            java.lang.String r10 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r10)
            r0.putString(r1, r10)
        L_0x011b:
            java.lang.String r10 = r8.zzf()
            byte[] r9 = r9.zzaV()
            java.lang.String r9 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r9)
            r0.putString(r10, r9)
            boolean r9 = r0.commit()
            if (r9 == 0) goto L_0x007d
            r9 = r2
        L_0x0131:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            com.google.android.gms.internal.ads.zzays r0 = r8.zzb(r2)
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = r0.zzk()
            r10.add(r0)
        L_0x0143:
            r0 = 2
            com.google.android.gms.internal.ads.zzays r0 = r8.zzb(r0)
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = r0.zzk()
            r10.add(r0)
        L_0x0151:
            java.io.File r0 = r8.zzd()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x015a:
            if (r4 >= r1) goto L_0x0176
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r10.contains(r2)
            if (r3 != 0) goto L_0x0173
            java.io.File r3 = r8.zzd()
            java.io.File r2 = com.google.android.gms.internal.ads.zzfpw.zzc(r2, r3)
            com.google.android.gms.internal.ads.zzfpw.zzd(r2)
        L_0x0173:
            int r4 = r4 + 1
            goto L_0x015a
        L_0x0176:
            return r9
        L_0x0177:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpv.zza(com.google.android.gms.internal.ads.zzayp, com.google.android.gms.internal.ads.zzfqb):boolean");
    }

    /* access modifiers changed from: package-private */
    public final zzays zzb(int i) {
        String str;
        if (i == 1) {
            str = this.zzc.getString(zzf(), (String) null);
        } else {
            str = this.zzc.getString(zze(), (String) null);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(str);
            zzgxz zzgxz = zzgxz.zzb;
            zzays zzh = zzays.zzh(zzgxz.zzv(stringToBytes, 0, stringToBytes.length));
            String zzk = zzh.zzk();
            File zzb2 = zzfpw.zzb(zzk, "pcam.jar", zzd());
            if (!zzb2.exists()) {
                zzb2 = zzfpw.zzb(zzk, "pcam", zzd());
            }
            File zzb3 = zzfpw.zzb(zzk, "pcbc", zzd());
            if (!zzb2.exists() || !zzb3.exists()) {
                return null;
            }
            return zzh;
        } catch (zzgzw unused) {
        }
    }

    public final zzfpu zzc(int i) {
        zzays zzb2 = zzb(1);
        if (zzb2 == null) {
            return null;
        }
        String zzk = zzb2.zzk();
        File zzb3 = zzfpw.zzb(zzk, "pcam.jar", zzd());
        if (!zzb3.exists()) {
            zzb3 = zzfpw.zzb(zzk, "pcam", zzd());
        }
        return new zzfpu(zzb2, zzb3, zzfpw.zzb(zzk, "pcbc", zzd()), zzfpw.zzb(zzk, "pcopt", zzd()));
    }
}
