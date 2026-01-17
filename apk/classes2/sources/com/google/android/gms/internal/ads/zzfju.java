package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfju {
    private final zzehb zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfco zzf;
    private final zzfcp zzg;
    private final Clock zzh;
    private final zzavu zzi;

    public zzfju(zzehb zzehb, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfco zzfco, zzfcp zzfcp, Clock clock, zzavu zzavu) {
        this.zza = zzehb;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfco;
        this.zzg = zzfcp;
        this.zzh = clock;
        this.zzi = zzavu;
    }

    public static String zzc(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* access modifiers changed from: private */
    public static String zzg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return zzl.zzk() ? "fakeForAdDebugLog" : str;
    }

    public final List zzd(zzfcn zzfcn, zzfca zzfca, List list) {
        return zze(zzfcn, zzfca, false, "", "", list, (zzcuu) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010c, code lost:
        if (r4 != false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfcn r16, com.google.android.gms.internal.ads.zzfca r17, boolean r18, java.lang.String r19, java.lang.String r20, java.util.List r21, com.google.android.gms.internal.ads.zzcuu r22) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r21.iterator()
        L_0x000c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0150
            java.lang.String r4 = "0"
            java.lang.String r5 = "1"
            r6 = 1
            r7 = r18
            if (r6 == r7) goto L_0x001d
            r8 = r4
            goto L_0x001e
        L_0x001d:
            r8 = r5
        L_0x001e:
            java.lang.Object r9 = r3.next()
            java.lang.String r9 = (java.lang.String) r9
            r10 = r16
            com.google.android.gms.internal.ads.zzfck r11 = r10.zza
            com.google.android.gms.internal.ads.zzfcw r11 = r11.zza
            java.lang.String r12 = "@gw_adlocid@"
            java.lang.String r11 = r11.zzf
            java.lang.String r9 = zzc(r9, r12, r11)
            java.lang.String r11 = "@gw_adnetrefresh@"
            java.lang.String r8 = zzc(r9, r11, r8)
            java.lang.String r9 = r0.zzb
            java.lang.String r11 = "@gw_sdkver@"
            java.lang.String r8 = zzc(r8, r11, r9)
            if (r1 == 0) goto L_0x008c
            java.lang.String r9 = "@gw_qdata@"
            java.lang.String r11 = r1.zzy
            java.lang.String r8 = zzc(r8, r9, r11)
            java.lang.String r9 = "@gw_adnetid@"
            java.lang.String r11 = r1.zzx
            java.lang.String r8 = zzc(r8, r9, r11)
            java.lang.String r9 = "@gw_allocid@"
            java.lang.String r11 = r1.zzw
            java.lang.String r8 = zzc(r8, r9, r11)
            android.content.Context r9 = r0.zze
            java.util.Map r11 = r1.zzaw
            boolean r12 = r1.zzW
            java.lang.String r8 = com.google.android.gms.internal.ads.zzbyq.zzc(r8, r9, r12, r11)
            com.google.android.gms.internal.ads.zzbcv r11 = com.google.android.gms.internal.ads.zzbde.zznK
            com.google.android.gms.internal.ads.zzbdc r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r11 = r12.zzb(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x008c
            int r11 = r1.zze
            r12 = 4
            if (r11 != r12) goto L_0x008c
            com.google.android.gms.ads.internal.zzv.zzr()
            boolean r9 = com.google.android.gms.ads.internal.util.zzs.zzH(r9)
            if (r6 == r9) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r4 = r5
        L_0x0086:
            java.lang.String r5 = "@gw_aps@"
            java.lang.String r8 = zzc(r8, r5, r4)
        L_0x008c:
            com.google.android.gms.internal.ads.zzehb r4 = r0.zza
            java.lang.String r5 = "@gw_adnetstatus@"
            java.lang.String r9 = r4.zzg()
            java.lang.String r5 = zzc(r8, r5, r9)
            long r8 = r4.zza()
            r4 = 10
            java.lang.String r8 = java.lang.Long.toString(r8, r4)
            java.lang.String r9 = "@gw_ttr@"
            java.lang.String r5 = zzc(r5, r9, r8)
            java.lang.String r8 = r0.zzc
            java.lang.String r9 = "@gw_seqnum@"
            java.lang.String r5 = zzc(r5, r9, r8)
            java.lang.String r8 = r0.zzd
            java.lang.String r9 = "@gw_sessid@"
            java.lang.String r5 = zzc(r5, r9, r8)
            com.google.android.gms.internal.ads.zzbcv r8 = com.google.android.gms.internal.ads.zzbde.zznR
            com.google.android.gms.internal.ads.zzbdc r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r9.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00eb
            java.lang.String r8 = "@gw_placement_id@"
            if (r22 == 0) goto L_0x00e5
            long r11 = r22.zza()
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e5
            long r11 = r22.zza()
            java.lang.String r4 = java.lang.Long.toString(r11, r4)
            java.lang.String r5 = zzc(r5, r8, r4)
            goto L_0x00eb
        L_0x00e5:
            java.lang.String r4 = ""
            java.lang.String r5 = zzc(r5, r8, r4)
        L_0x00eb:
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzdO
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r8.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r8 = 0
            if (r4 == 0) goto L_0x0105
            boolean r4 = android.text.TextUtils.isEmpty(r19)
            if (r4 != 0) goto L_0x0105
            r8 = r6
        L_0x0105:
            boolean r4 = android.text.TextUtils.isEmpty(r20)
            r4 = r4 ^ r6
            if (r8 != 0) goto L_0x010f
            if (r4 == 0) goto L_0x0147
            goto L_0x0110
        L_0x010f:
            r6 = r4
        L_0x0110:
            android.net.Uri r4 = android.net.Uri.parse(r5)
            com.google.android.gms.internal.ads.zzavu r9 = r0.zzi
            boolean r4 = r9.zzf(r4)
            if (r4 == 0) goto L_0x0147
            android.net.Uri r4 = android.net.Uri.parse(r5)
            android.net.Uri$Builder r4 = r4.buildUpon()
            if (r8 == 0) goto L_0x012f
            java.lang.String r5 = "ms"
            r8 = r19
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r5, r8)
            goto L_0x0131
        L_0x012f:
            r8 = r19
        L_0x0131:
            if (r6 == 0) goto L_0x013c
            java.lang.String r5 = "attok"
            r6 = r20
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r5, r6)
            goto L_0x013e
        L_0x013c:
            r6 = r20
        L_0x013e:
            android.net.Uri r4 = r4.build()
            java.lang.String r5 = r4.toString()
            goto L_0x014b
        L_0x0147:
            r8 = r19
            r6 = r20
        L_0x014b:
            r2.add(r5)
            goto L_0x000c
        L_0x0150:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfju.zze(com.google.android.gms.internal.ads.zzfcn, com.google.android.gms.internal.ads.zzfca, boolean, java.lang.String, java.lang.String, java.util.List, com.google.android.gms.internal.ads.zzcuu):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065 A[LOOP:0: B:12:0x005f->B:14:0x0065, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzf(com.google.android.gms.internal.ads.zzfca r11, java.util.List r12, com.google.android.gms.internal.ads.zzbwc r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r10.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r13.zzc()     // Catch:{ RemoteException -> 0x00b0 }
            int r13 = r13.zzb()     // Catch:{ RemoteException -> 0x00b0 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ RemoteException -> 0x00b0 }
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzdP
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzfcp r4 = r10.zzg
            if (r4 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzfvn r4 = com.google.android.gms.internal.ads.zzfvn.zzc()
            goto L_0x003b
        L_0x0032:
            com.google.android.gms.internal.ads.zzfco r4 = r4.zza
            goto L_0x0037
        L_0x0035:
            com.google.android.gms.internal.ads.zzfco r4 = r10.zzf
        L_0x0037:
            com.google.android.gms.internal.ads.zzfvn r4 = com.google.android.gms.internal.ads.zzfvn.zzd(r4)
        L_0x003b:
            com.google.android.gms.internal.ads.zzfjs r5 = new com.google.android.gms.internal.ads.zzfjs
            r5.<init>()
            com.google.android.gms.internal.ads.zzfvn r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfjt r7 = new com.google.android.gms.internal.ads.zzfjt
            r7.<init>()
            com.google.android.gms.internal.ads.zzfvn r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L_0x005f:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x00af
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzc(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzc(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyq.zzc(r6, r7, r8, r9)
            r0.add(r6)
            goto L_0x005f
        L_0x00af:
            return r0
        L_0x00b0:
            r11 = move-exception
            int r12 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r12 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfju.zzf(com.google.android.gms.internal.ads.zzfca, java.util.List, com.google.android.gms.internal.ads.zzbwc):java.util.List");
    }
}
