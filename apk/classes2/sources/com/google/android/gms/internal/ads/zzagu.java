package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzagu implements zzau {
    public final String zza;
    public final String zzb;

    public zzagu(String str, String str2) {
        this.zza = zzfuv.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagu zzagu = (zzagu) obj;
            return this.zza.equals(zzagu.zza) && this.zzb.equals(zzagu.zzb);
        }
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzar r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.zza
            int r1 = r0.hashCode()
            switch(r1) {
                case -1935137620: goto L_0x0067;
                case -215998278: goto L_0x005d;
                case -113312716: goto L_0x0053;
                case 62359119: goto L_0x0049;
                case 67703139: goto L_0x003e;
                case 79833656: goto L_0x0034;
                case 428414940: goto L_0x0029;
                case 993300766: goto L_0x001f;
                case 1746739798: goto L_0x0015;
                case 1939198791: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0071
        L_0x000b:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 1
            goto L_0x0072
        L_0x0015:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 3
            goto L_0x0072
        L_0x001f:
            java.lang.String r1 = "DISCNUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 6
            goto L_0x0072
        L_0x0029:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 9
            goto L_0x0072
        L_0x0034:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 0
            goto L_0x0072
        L_0x003e:
            java.lang.String r1 = "GENRE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 8
            goto L_0x0072
        L_0x0049:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 2
            goto L_0x0072
        L_0x0053:
            java.lang.String r1 = "TRACKNUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 4
            goto L_0x0072
        L_0x005d:
            java.lang.String r1 = "TOTALDISCS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 7
            goto L_0x0072
        L_0x0067:
            java.lang.String r1 = "TOTALTRACKS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 5
            goto L_0x0072
        L_0x0071:
            r0 = -1
        L_0x0072:
            r1 = 10
            switch(r0) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x00c0;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009c;
                case 6: goto L_0x0090;
                case 7: goto L_0x0084;
                case 8: goto L_0x007e;
                case 9: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x00cb
        L_0x0078:
            java.lang.String r0 = r2.zzb
            r3.zzh(r0)
            return
        L_0x007e:
            java.lang.String r0 = r2.zzb
            r3.zzj(r0)
            return
        L_0x0084:
            java.lang.String r0 = r2.zzb
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgbt.zzg(r0, r1)
            if (r0 == 0) goto L_0x00cb
            r3.zzs(r0)
            return
        L_0x0090:
            java.lang.String r0 = r2.zzb
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgbt.zzg(r0, r1)
            if (r0 == 0) goto L_0x00cb
            r3.zzi(r0)
            return
        L_0x009c:
            java.lang.String r0 = r2.zzb
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgbt.zzg(r0, r1)
            if (r0 == 0) goto L_0x00cb
            r3.zzt(r0)
            return
        L_0x00a8:
            java.lang.String r0 = r2.zzb
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgbt.zzg(r0, r1)
            if (r0 == 0) goto L_0x00cb
            r3.zzu(r0)
            return
        L_0x00b4:
            java.lang.String r0 = r2.zzb
            r3.zzc(r0)
            return
        L_0x00ba:
            java.lang.String r0 = r2.zzb
            r3.zzd(r0)
            return
        L_0x00c0:
            java.lang.String r0 = r2.zzb
            r3.zze(r0)
            return
        L_0x00c6:
            java.lang.String r0 = r2.zzb
            r3.zzr(r0)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagu.zza(com.google.android.gms.internal.ads.zzar):void");
    }
}
