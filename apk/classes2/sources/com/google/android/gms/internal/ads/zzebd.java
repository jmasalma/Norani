package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzebd implements zzgdj {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzebe zzb;

    zzebd(zzebe zzebe, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzebe);
        this.zzb = zzebe;
    }

    public final void zza(Throwable th) {
        int i = zze.zza;
        zzo.zzg("Failed to get signals bundle");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzebe r0 = r8.zzb
            com.google.android.gms.internal.ads.zzcva r9 = (com.google.android.gms.internal.ads.zzcva) r9
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            android.os.Bundle r9 = r9.zza
            java.lang.String r1 = "ad_types"
            java.lang.Object r1 = r9.get(r1)
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L_0x001a
            java.util.List r1 = (java.util.List) r1
            goto L_0x0024
        L_0x001a:
            boolean r2 = r1 instanceof java.lang.String[]
            if (r2 == 0) goto L_0x004a
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = java.util.Arrays.asList(r1)
        L_0x0024:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x0031
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L_0x0031
        L_0x0045:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            goto L_0x004e
        L_0x004a:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x004e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0057:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1396342996: goto L_0x008c;
                case -1052618729: goto L_0x0082;
                case -239580146: goto L_0x0078;
                case 604727084: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0096
        L_0x006e:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0096
            r2 = r7
            goto L_0x0097
        L_0x0078:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0096
            r2 = r4
            goto L_0x0097
        L_0x0082:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0096
            r2 = r6
            goto L_0x0097
        L_0x008c:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0096
            r2 = 0
            goto L_0x0097
        L_0x0096:
            r2 = -1
        L_0x0097:
            if (r2 == 0) goto L_0x00ab
            if (r2 == r7) goto L_0x00a8
            if (r2 == r6) goto L_0x00a5
            if (r2 == r4) goto L_0x00a2
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x00ad
        L_0x00a2:
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.REWARD_BASED_VIDEO_AD
            goto L_0x00ad
        L_0x00a5:
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.NATIVE_APP_INSTALL
            goto L_0x00ad
        L_0x00a8:
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.INTERSTITIAL
            goto L_0x00ad
        L_0x00ab:
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.BANNER
        L_0x00ad:
            r5.add(r2)
            goto L_0x0057
        L_0x00b1:
            com.google.android.gms.internal.ads.zzbcj$zzaf$zzd r7 = com.google.android.gms.internal.ads.zzebe.zzb(r0, r9)
            com.google.android.gms.internal.ads.zzbcj$zzab r6 = com.google.android.gms.internal.ads.zzebe.zza(r0, r9)
            boolean r4 = r8.zza
            com.google.android.gms.internal.ads.zzebc r9 = new com.google.android.gms.internal.ads.zzebc
            r2 = r9
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            com.google.android.gms.internal.ads.zzeas r0 = r0.zza
            r0.zza(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebd.zzb(java.lang.Object):void");
    }
}
