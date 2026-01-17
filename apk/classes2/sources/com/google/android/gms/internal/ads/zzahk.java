package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahk extends zzahf {
    public final String zza;
    public final zzfyq zzb;

    public zzahk(String str, String str2, List list) {
        super(str);
        zzdd.zzd(!list.isEmpty());
        this.zza = str2;
        zzfyq zzl = zzfyq.zzl(list);
        this.zzb = zzl;
        String str3 = (String) zzl.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahk zzahk = (zzahk) obj;
            return Objects.equals(this.zzf, zzahk.zzf) && Objects.equals(this.zza, zzahk.zza) && this.zzb.equals(zzahk.zzb);
        }
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return this.zzf + ": description=" + this.zza + ": values=" + valueOf;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzar r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.zzf
            int r1 = r0.hashCode()
            r2 = 10
            r3 = 4
            r4 = -1
            r5 = 3
            r6 = 1
            r7 = 2
            r8 = 0
            switch(r1) {
                case 82815: goto L_0x010b;
                case 82878: goto L_0x0100;
                case 82897: goto L_0x00f5;
                case 83253: goto L_0x00eb;
                case 83254: goto L_0x00e1;
                case 83255: goto L_0x00d6;
                case 83341: goto L_0x00cb;
                case 83378: goto L_0x00c1;
                case 83536: goto L_0x00b6;
                case 83552: goto L_0x00ab;
                case 2567331: goto L_0x00a0;
                case 2569357: goto L_0x0094;
                case 2569358: goto L_0x0088;
                case 2569891: goto L_0x007c;
                case 2570401: goto L_0x0070;
                case 2570410: goto L_0x0064;
                case 2571565: goto L_0x0058;
                case 2575251: goto L_0x004d;
                case 2581512: goto L_0x0042;
                case 2581513: goto L_0x0037;
                case 2581514: goto L_0x002b;
                case 2583398: goto L_0x001f;
                case 2590194: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0115
        L_0x0013:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 11
            goto L_0x0116
        L_0x001f:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 9
            goto L_0x0116
        L_0x002b:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 19
            goto L_0x0116
        L_0x0037:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 5
            goto L_0x0116
        L_0x0042:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = r5
            goto L_0x0116
        L_0x004d:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = r6
            goto L_0x0116
        L_0x0058:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 21
            goto L_0x0116
        L_0x0064:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 15
            goto L_0x0116
        L_0x0070:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 14
            goto L_0x0116
        L_0x007c:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 13
            goto L_0x0116
        L_0x0088:
            java.lang.String r1 = "TCON"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 22
            goto L_0x0116
        L_0x0094:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 17
            goto L_0x0116
        L_0x00a0:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 7
            goto L_0x0116
        L_0x00ab:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = r2
            goto L_0x0116
        L_0x00b6:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 20
            goto L_0x0116
        L_0x00c1:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = r8
            goto L_0x0116
        L_0x00cb:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 8
            goto L_0x0116
        L_0x00d6:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 18
            goto L_0x0116
        L_0x00e1:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = r3
            goto L_0x0116
        L_0x00eb:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = r7
            goto L_0x0116
        L_0x00f5:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 12
            goto L_0x0116
        L_0x0100:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 16
            goto L_0x0116
        L_0x010b:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 6
            goto L_0x0116
        L_0x0115:
            r0 = r4
        L_0x0116:
            switch(r0) {
                case 0: goto L_0x025c;
                case 1: goto L_0x025c;
                case 2: goto L_0x0250;
                case 3: goto L_0x0250;
                case 4: goto L_0x0244;
                case 5: goto L_0x0244;
                case 6: goto L_0x0238;
                case 7: goto L_0x0238;
                case 8: goto L_0x0208;
                case 9: goto L_0x0208;
                case 10: goto L_0x01f4;
                case 11: goto L_0x01f4;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01cd;
                case 14: goto L_0x0199;
                case 15: goto L_0x0165;
                case 16: goto L_0x0159;
                case 17: goto L_0x0159;
                case 18: goto L_0x014d;
                case 19: goto L_0x014d;
                case 20: goto L_0x0141;
                case 21: goto L_0x0141;
                case 22: goto L_0x011b;
                default: goto L_0x0119;
            }
        L_0x0119:
            goto L_0x0267
        L_0x011b:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r1 = r0.get(r8)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r1 = com.google.android.gms.internal.ads.zzgbt.zzg(r1, r2)
            if (r1 != 0) goto L_0x0133
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzj(r0)
            return
        L_0x0133:
            int r0 = r1.intValue()
            java.lang.String r0 = com.google.android.gms.internal.ads.zzahg.zza(r0)
            if (r0 == 0) goto L_0x0267
            r10.zzj(r0)
            return
        L_0x0141:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzv(r0)
            return
        L_0x014d:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzg(r0)
            return
        L_0x0159:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzf(r0)
            return
        L_0x0165:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = zzb(r0)
            int r1 = r0.size()
            if (r1 == r6) goto L_0x018f
            if (r1 == r7) goto L_0x0186
            if (r1 == r5) goto L_0x017d
            goto L_0x0267
        L_0x017d:
            java.lang.Object r1 = r0.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.zzn(r1)
        L_0x0186:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.zzo(r1)
        L_0x018f:
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.zzp(r0)
            return
        L_0x0199:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = zzb(r0)
            int r1 = r0.size()
            if (r1 == r6) goto L_0x01c3
            if (r1 == r7) goto L_0x01ba
            if (r1 == r5) goto L_0x01b1
            goto L_0x0267
        L_0x01b1:
            java.lang.Object r1 = r0.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.zzk(r1)
        L_0x01ba:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.zzl(r1)
        L_0x01c3:
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.zzm(r0)
            return
        L_0x01cd:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            java.lang.String r1 = r0.substring(r7, r3)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            java.lang.String r0 = r0.substring(r8, r7)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            r10.zzl(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
            r10.zzk(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f3 }
        L_0x01f3:
            return
        L_0x01f4:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb     // Catch:{ NumberFormatException -> 0x0207 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ NumberFormatException -> 0x0207 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x0207 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0207 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0207 }
            r10.zzm(r0)     // Catch:{ NumberFormatException -> 0x0207 }
        L_0x0207:
            return
        L_0x0208:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = com.google.android.gms.internal.ads.zzex.zza
            java.lang.String r1 = "/"
            java.lang.String[] r0 = r0.split(r1, r4)
            r1 = r0[r8]     // Catch:{ NumberFormatException -> 0x0237 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0237 }
            int r2 = r0.length     // Catch:{ NumberFormatException -> 0x0237 }
            if (r2 <= r6) goto L_0x022c
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x0237 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0237 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0237 }
            goto L_0x022d
        L_0x022c:
            r0 = 0
        L_0x022d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0237 }
            r10.zzu(r1)     // Catch:{ NumberFormatException -> 0x0237 }
            r10.zzt(r0)     // Catch:{ NumberFormatException -> 0x0237 }
        L_0x0237:
            return
        L_0x0238:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzd(r0)
            return
        L_0x0244:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzc(r0)
            return
        L_0x0250:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zze(r0)
            return
        L_0x025c:
            com.google.android.gms.internal.ads.zzfyq r0 = r9.zzb
            java.lang.Object r0 = r0.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.zzr(r0)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahk.zza(com.google.android.gms.internal.ads.zzar):void");
    }
}
