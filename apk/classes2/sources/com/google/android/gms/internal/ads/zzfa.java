package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfa implements zzau {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzfa(java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            r6 = this;
            r6.<init>()
            int r0 = r7.hashCode()
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            r5 = 0
            switch(r0) {
                case -1949883051: goto L_0x0038;
                case -269399509: goto L_0x002e;
                case 1011693540: goto L_0x0024;
                case 1098277265: goto L_0x001a;
                case 2002123038: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = r1
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "auxiliary.tracks.offset"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = r4
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "auxiliary.tracks.length"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = r2
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "auxiliary.tracks.interleaved"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = r3
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = r5
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x007c
            if (r0 == r4) goto L_0x006b
            if (r0 == r2) goto L_0x006b
            if (r0 == r1) goto L_0x0063
            if (r0 == r3) goto L_0x004e
            goto L_0x008a
        L_0x004e:
            r0 = 75
            if (r10 != r0) goto L_0x005e
            int r10 = r8.length
            if (r10 != r4) goto L_0x005d
            byte r10 = r8[r5]
            if (r10 == 0) goto L_0x005b
            if (r10 != r4) goto L_0x005d
        L_0x005b:
            r10 = r0
            goto L_0x005f
        L_0x005d:
            r10 = r0
        L_0x005e:
            r4 = r5
        L_0x005f:
            com.google.android.gms.internal.ads.zzdd.zzd(r4)
            goto L_0x008a
        L_0x0063:
            if (r10 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r4 = r5
        L_0x0067:
            com.google.android.gms.internal.ads.zzdd.zzd(r4)
            goto L_0x008a
        L_0x006b:
            r0 = 78
            if (r10 != r0) goto L_0x0077
            int r10 = r8.length
            r1 = 8
            if (r10 != r1) goto L_0x0076
            r10 = r0
            goto L_0x0078
        L_0x0076:
            r10 = r0
        L_0x0077:
            r4 = r5
        L_0x0078:
            com.google.android.gms.internal.ads.zzdd.zzd(r4)
            goto L_0x008a
        L_0x007c:
            r0 = 23
            if (r10 != r0) goto L_0x0086
            int r10 = r8.length
            if (r10 != r3) goto L_0x0085
            r10 = r0
            goto L_0x0087
        L_0x0085:
            r10 = r0
        L_0x0086:
            r4 = r5
        L_0x0087:
            com.google.android.gms.internal.ads.zzdd.zzd(r4)
        L_0x008a:
            r6.zza = r7
            r6.zzb = r8
            r6.zzc = r9
            r6.zzd = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfa.<init>(java.lang.String, byte[], int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzfa zzfa = (zzfa) obj;
            return this.zza.equals(zzfa.zza) && Arrays.equals(this.zzb, zzfa.zzb) && this.zzc == zzfa.zzc && this.zzd == zzfa.zzd;
        }
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final /* synthetic */ void zza(zzar zzar) {
    }

    public final List zzb() {
        zzdd.zzg(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final String toString() {
        String str;
        int i = this.zzd;
        if (i != 0) {
            if (i == 1) {
                str = zzex.zzB(this.zzb);
            } else if (i == 23) {
                str = String.valueOf(Float.intBitsToFloat(zzgbt.zzd(this.zzb)));
            } else if (i == 67) {
                str = String.valueOf(zzgbt.zzd(this.zzb));
            } else if (i == 75) {
                str = String.valueOf(this.zzb[0] & 255);
            } else if (i == 78) {
                str = String.valueOf(new zzen(this.zzb).zzw());
            }
            String str2 = this.zza;
            return "mdta: key=" + str2 + ", value=" + str;
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List zzb2 = zzb();
            StringBuilder sb = new StringBuilder();
            sb.append("track types = ");
            String str3 = ",";
            zzfvh.zzb(sb, zzb2, ",");
            str = sb.toString();
            String str22 = this.zza;
            return "mdta: key=" + str22 + ", value=" + str;
        }
        byte[] bArr = this.zzb;
        String str4 = zzex.zza;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb2.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i2] & Ascii.SI, 16));
        }
        str = sb2.toString();
        String str222 = this.zza;
        return "mdta: key=" + str222 + ", value=" + str;
    }
}
