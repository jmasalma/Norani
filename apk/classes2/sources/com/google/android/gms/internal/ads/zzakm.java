package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzakm implements zzakr {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzz r4) {
        /*
            r3 = this;
            java.lang.String r4 = r4.zzo
            if (r4 == 0) goto L_0x0073
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 2
            switch(r0) {
                case -1351681404: goto L_0x005f;
                case -1248334819: goto L_0x0055;
                case -1026075066: goto L_0x004b;
                case -1004728940: goto L_0x0041;
                case 691401887: goto L_0x0037;
                case 822864842: goto L_0x002d;
                case 1157994102: goto L_0x0023;
                case 1668750253: goto L_0x0019;
                case 1693976202: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0069
        L_0x000e:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 8
            goto L_0x006a
        L_0x0019:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 3
            goto L_0x006a
        L_0x0023:
            java.lang.String r0 = "application/vobsub"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 6
            goto L_0x006a
        L_0x002d:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 0
            goto L_0x006a
        L_0x0037:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 4
            goto L_0x006a
        L_0x0041:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = r1
            goto L_0x006a
        L_0x004b:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = r2
            goto L_0x006a
        L_0x0055:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 5
            goto L_0x006a
        L_0x005f:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 7
            goto L_0x006a
        L_0x0069:
            r0 = -1
        L_0x006a:
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x0072;
                case 2: goto L_0x0071;
                case 3: goto L_0x0070;
                case 4: goto L_0x006f;
                case 5: goto L_0x006f;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0073
        L_0x006e:
            return r1
        L_0x006f:
            return r2
        L_0x0070:
            return r1
        L_0x0071:
            return r2
        L_0x0072:
            return r1
        L_0x0073:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakm.zza(com.google.android.gms.internal.ads.zzz):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzakt zzb(com.google.android.gms.internal.ads.zzz r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.zzo
            if (r0 == 0) goto L_0x00aa
            int r1 = r0.hashCode()
            switch(r1) {
                case -1351681404: goto L_0x005d;
                case -1248334819: goto L_0x0053;
                case -1026075066: goto L_0x0049;
                case -1004728940: goto L_0x003f;
                case 691401887: goto L_0x0035;
                case 822864842: goto L_0x002b;
                case 1157994102: goto L_0x0021;
                case 1668750253: goto L_0x0017;
                case 1693976202: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0067
        L_0x000c:
            java.lang.String r1 = "application/ttml+xml"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 8
            goto L_0x0068
        L_0x0017:
            java.lang.String r1 = "application/x-subrip"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 3
            goto L_0x0068
        L_0x0021:
            java.lang.String r1 = "application/vobsub"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 6
            goto L_0x0068
        L_0x002b:
            java.lang.String r1 = "text/x-ssa"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 0
            goto L_0x0068
        L_0x0035:
            java.lang.String r1 = "application/x-quicktime-tx3g"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 4
            goto L_0x0068
        L_0x003f:
            java.lang.String r1 = "text/vtt"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0049:
            java.lang.String r1 = "application/x-mp4-vtt"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r1 = "application/pgs"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 5
            goto L_0x0068
        L_0x005d:
            java.lang.String r1 = "application/dvbsubs"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0067
            r1 = 7
            goto L_0x0068
        L_0x0067:
            r1 = -1
        L_0x0068:
            switch(r1) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x009c;
                case 2: goto L_0x0096;
                case 3: goto L_0x0090;
                case 4: goto L_0x0088;
                case 5: goto L_0x0082;
                case 6: goto L_0x007a;
                case 7: goto L_0x0072;
                case 8: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x00aa
        L_0x006c:
            com.google.android.gms.internal.ads.zzalt r3 = new com.google.android.gms.internal.ads.zzalt
            r3.<init>()
            return r3
        L_0x0072:
            com.google.android.gms.internal.ads.zzalf r0 = new com.google.android.gms.internal.ads.zzalf
            java.util.List r3 = r3.zzr
            r0.<init>(r3)
            return r0
        L_0x007a:
            com.google.android.gms.internal.ads.zzama r0 = new com.google.android.gms.internal.ads.zzama
            java.util.List r3 = r3.zzr
            r0.<init>(r3)
            return r0
        L_0x0082:
            com.google.android.gms.internal.ads.zzalh r3 = new com.google.android.gms.internal.ads.zzalh
            r3.<init>()
            return r3
        L_0x0088:
            com.google.android.gms.internal.ads.zzaly r0 = new com.google.android.gms.internal.ads.zzaly
            java.util.List r3 = r3.zzr
            r0.<init>(r3)
            return r0
        L_0x0090:
            com.google.android.gms.internal.ads.zzaln r3 = new com.google.android.gms.internal.ads.zzaln
            r3.<init>()
            return r3
        L_0x0096:
            com.google.android.gms.internal.ads.zzamb r3 = new com.google.android.gms.internal.ads.zzamb
            r3.<init>()
            return r3
        L_0x009c:
            com.google.android.gms.internal.ads.zzamm r3 = new com.google.android.gms.internal.ads.zzamm
            r3.<init>()
            return r3
        L_0x00a2:
            com.google.android.gms.internal.ads.zzalj r0 = new com.google.android.gms.internal.ads.zzalj
            java.util.List r3 = r3.zzr
            r0.<init>(r3)
            return r0
        L_0x00aa:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakm.zzb(com.google.android.gms.internal.ads.zzz):com.google.android.gms.internal.ads.zzakt");
    }

    public final boolean zzc(zzz zzz) {
        String str = zzz.zzo;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}
