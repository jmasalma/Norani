package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbxv implements zzbya {
    public static final /* synthetic */ int zzb = 0;
    /* access modifiers changed from: private */
    public static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhdk zzd;
    private final LinkedHashMap zze;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Context zzh;
    private final zzbxx zzi;
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxv(Context context, VersionInfoParcel versionInfoParcel, zzbxx zzbxx, String str, zzbxw zzbxw) {
        Preconditions.checkNotNull(zzbxx, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxx;
        for (String lowerCase : zzbxx.zze) {
            this.zzk.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhdk zzc2 = zzhfm.zzc();
        zzc2.zzn(9);
        if (str != null) {
            zzc2.zzj(str);
            zzc2.zzh(str);
        }
        zzhdl zzc3 = zzhdm.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc3.zza(str2);
        }
        zzc2.zzg((zzhdm) zzc3.zzbr());
        zzhfa zzc4 = zzhfb.zzc();
        zzc4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc4.zza(str3);
        }
        long apkVersion = (long) GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhfb) zzc4.zzbr());
        this.zzd = zzc2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbxv r10, java.util.Map r11) {
        /*
            r0 = 1
            if (r11 != 0) goto L_0x0005
            goto L_0x0079
        L_0x0005:
            java.util.Set r1 = r11.keySet()     // Catch:{ JSONException -> 0x017d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ JSONException -> 0x017d }
        L_0x000d:
            boolean r2 = r1.hasNext()     // Catch:{ JSONException -> 0x017d }
            if (r2 == 0) goto L_0x0079
            java.lang.Object r2 = r1.next()     // Catch:{ JSONException -> 0x017d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x017d }
            java.lang.Object r3 = r11.get(r2)     // Catch:{ JSONException -> 0x017d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x017d }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017d }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x017d }
            java.lang.String r3 = "matches"
            org.json.JSONArray r3 = r4.optJSONArray(r3)     // Catch:{ JSONException -> 0x017d }
            if (r3 == 0) goto L_0x000d
            java.lang.Object r4 = r10.zzj     // Catch:{ JSONException -> 0x017d }
            monitor-enter(r4)     // Catch:{ JSONException -> 0x017d }
            int r5 = r3.length()     // Catch:{ all -> 0x0076 }
            monitor-enter(r4)     // Catch:{ all -> 0x0076 }
            java.util.LinkedHashMap r6 = r10.zze     // Catch:{ all -> 0x0073 }
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x0073 }
            com.google.android.gms.internal.ads.zzhey r6 = (com.google.android.gms.internal.ads.zzhey) r6     // Catch:{ all -> 0x0073 }
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            if (r6 != 0) goto L_0x0055
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r3.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.String r5 = "Cannot find the corresponding resource object for "
            r3.append(r5)     // Catch:{ all -> 0x0076 }
            r3.append(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0076 }
            com.google.android.gms.internal.ads.zzbxz.zza(r2)     // Catch:{ all -> 0x0076 }
            monitor-exit(r4)     // Catch:{ all -> 0x0076 }
            goto L_0x000d
        L_0x0055:
            r2 = 0
            r7 = r2
        L_0x0057:
            if (r7 >= r5) goto L_0x0069
            org.json.JSONObject r8 = r3.getJSONObject(r7)     // Catch:{ all -> 0x0076 }
            java.lang.String r9 = "threat_type"
            java.lang.String r8 = r8.getString(r9)     // Catch:{ all -> 0x0076 }
            r6.zza(r8)     // Catch:{ all -> 0x0076 }
            int r7 = r7 + 1
            goto L_0x0057
        L_0x0069:
            boolean r3 = r10.zza     // Catch:{ all -> 0x0076 }
            if (r5 <= 0) goto L_0x006e
            r2 = r0
        L_0x006e:
            r2 = r2 | r3
            r10.zza = r2     // Catch:{ all -> 0x0076 }
            monitor-exit(r4)     // Catch:{ all -> 0x0076 }
            goto L_0x000d
        L_0x0073:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0076 }
            throw r10     // Catch:{ JSONException -> 0x017d }
        L_0x0079:
            boolean r11 = r10.zza     // Catch:{ JSONException -> 0x017d }
            if (r11 == 0) goto L_0x008c
            java.lang.Object r11 = r10.zzj     // Catch:{ JSONException -> 0x017d }
            monitor-enter(r11)     // Catch:{ JSONException -> 0x017d }
            com.google.android.gms.internal.ads.zzhdk r1 = r10.zzd     // Catch:{ all -> 0x0089 }
            r2 = 10
            r1.zzn(r2)     // Catch:{ all -> 0x0089 }
            monitor-exit(r11)     // Catch:{ all -> 0x0089 }
            goto L_0x008c
        L_0x0089:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0089 }
            throw r10     // Catch:{ JSONException -> 0x017d }
        L_0x008c:
            boolean r11 = r10.zza     // Catch:{ JSONException -> 0x017d }
            r1 = 0
            if (r11 == 0) goto L_0x0097
            com.google.android.gms.internal.ads.zzbxx r2 = r10.zzi     // Catch:{ JSONException -> 0x017d }
            boolean r2 = r2.zzg     // Catch:{ JSONException -> 0x017d }
            if (r2 != 0) goto L_0x00a9
        L_0x0097:
            boolean r2 = r10.zzm     // Catch:{ JSONException -> 0x017d }
            if (r2 == 0) goto L_0x00a1
            com.google.android.gms.internal.ads.zzbxx r2 = r10.zzi     // Catch:{ JSONException -> 0x017d }
            boolean r2 = r2.zzf     // Catch:{ JSONException -> 0x017d }
            if (r2 != 0) goto L_0x00a9
        L_0x00a1:
            if (r11 != 0) goto L_0x0178
            com.google.android.gms.internal.ads.zzbxx r11 = r10.zzi     // Catch:{ JSONException -> 0x017d }
            boolean r11 = r11.zzd     // Catch:{ JSONException -> 0x017d }
            if (r11 == 0) goto L_0x0178
        L_0x00a9:
            java.lang.Object r11 = r10.zzj     // Catch:{ JSONException -> 0x017d }
            monitor-enter(r11)     // Catch:{ JSONException -> 0x017d }
            java.util.LinkedHashMap r2 = r10.zze     // Catch:{ all -> 0x0175 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0175 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0175 }
        L_0x00b6:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x00ce
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzhey r3 = (com.google.android.gms.internal.ads.zzhey) r3     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzhdk r4 = r10.zzd     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzgzh r3 = r3.zzbr()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzhez r3 = (com.google.android.gms.internal.ads.zzhez) r3     // Catch:{ all -> 0x0175 }
            r4.zzc(r3)     // Catch:{ all -> 0x0175 }
            goto L_0x00b6
        L_0x00ce:
            com.google.android.gms.internal.ads.zzhdk r2 = r10.zzd     // Catch:{ all -> 0x0175 }
            java.util.List r3 = r10.zzf     // Catch:{ all -> 0x0175 }
            r2.zza(r3)     // Catch:{ all -> 0x0175 }
            java.util.List r3 = r10.zzg     // Catch:{ all -> 0x0175 }
            r2.zzb(r3)     // Catch:{ all -> 0x0175 }
            boolean r3 = com.google.android.gms.internal.ads.zzbxz.zzb()     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x013f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r2.zzl()     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = r2.zzk()     // Catch:{ all -> 0x0175 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r6.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r7 = "Sending SB report\n  url: "
            r6.append(r7)     // Catch:{ all -> 0x0175 }
            r6.append(r4)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = "\n  clickUrl: "
            r6.append(r4)     // Catch:{ all -> 0x0175 }
            r6.append(r5)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = "\n  resources: \n"
            r6.append(r4)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0175 }
            r3.<init>(r4)     // Catch:{ all -> 0x0175 }
            java.util.List r4 = r2.zzm()     // Catch:{ all -> 0x0175 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0175 }
        L_0x0113:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0175 }
            if (r5 == 0) goto L_0x0138
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzhez r5 = (com.google.android.gms.internal.ads.zzhez) r5     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "    ["
            r3.append(r6)     // Catch:{ all -> 0x0175 }
            int r6 = r5.zzc()     // Catch:{ all -> 0x0175 }
            r3.append(r6)     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "] "
            r3.append(r6)     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = r5.zzg()     // Catch:{ all -> 0x0175 }
            r3.append(r5)     // Catch:{ all -> 0x0175 }
            goto L_0x0113
        L_0x0138:
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzbxz.zza(r3)     // Catch:{ all -> 0x0175 }
        L_0x013f:
            com.google.android.gms.internal.ads.zzgzh r2 = r2.zzbr()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzhfm r2 = (com.google.android.gms.internal.ads.zzhfm) r2     // Catch:{ all -> 0x0175 }
            byte[] r2 = r2.zzaV()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzbxx r3 = r10.zzi     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = r3.zzb     // Catch:{ all -> 0x0175 }
            com.google.android.gms.ads.internal.util.zzbo r4 = new com.google.android.gms.ads.internal.util.zzbo     // Catch:{ all -> 0x0175 }
            android.content.Context r10 = r10.zzh     // Catch:{ all -> 0x0175 }
            r4.<init>(r10)     // Catch:{ all -> 0x0175 }
            com.google.common.util.concurrent.ListenableFuture r10 = r4.zzb(r0, r3, r1, r2)     // Catch:{ all -> 0x0175 }
            boolean r0 = com.google.android.gms.internal.ads.zzbxz.zzb()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.zzbxs r0 = new com.google.android.gms.internal.ads.zzbxs     // Catch:{ all -> 0x0175 }
            r0.<init>()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzgdy r1 = com.google.android.gms.internal.ads.zzcaf.zza     // Catch:{ all -> 0x0175 }
            r10.addListener(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x0168:
            com.google.android.gms.internal.ads.zzbxt r0 = new com.google.android.gms.internal.ads.zzbxt     // Catch:{ all -> 0x0175 }
            r0.<init>()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.internal.ads.zzgdy r1 = com.google.android.gms.internal.ads.zzcaf.zzg     // Catch:{ all -> 0x0175 }
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgdn.zzm(r10, r0, r1)     // Catch:{ all -> 0x0175 }
            monitor-exit(r11)     // Catch:{ all -> 0x0175 }
            goto L_0x019e
        L_0x0175:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0175 }
            throw r10     // Catch:{ JSONException -> 0x017d }
        L_0x0178:
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgdn.zzh(r1)     // Catch:{ JSONException -> 0x017d }
            goto L_0x019e
        L_0x017d:
            r10 = move-exception
            com.google.android.gms.internal.ads.zzbeo r11 = com.google.android.gms.internal.ads.zzbfm.zza
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0193
            int r11 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r11 = "Failed to get SafeBrowsing metadata"
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r11, r10)
        L_0x0193:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r11 = "Safebrowsing report transmission failed."
            r10.<init>(r11)
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgdn.zzg(r10)
        L_0x019e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxv.zzb(com.google.android.gms.internal.ads.zzbxv, java.util.Map):com.google.common.util.concurrent.ListenableFuture");
    }

    public static /* synthetic */ void zzd(zzbxv zzbxv, Bitmap bitmap) {
        zzgxx zzt = zzgxz.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (zzbxv.zzj) {
            zzhdk zzhdk = zzbxv.zzd;
            zzhes zzc2 = zzheu.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(2);
            zzhdk.zzi((zzheu) zzc2.zzbr());
        }
    }

    public final zzbxx zza() {
        return this.zzi;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(java.lang.String r8, java.util.Map r9, int r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.zzj
            monitor-enter(r0)
            r1 = 3
            if (r10 != r1) goto L_0x0009
            r2 = 1
            r7.zzm = r2     // Catch:{ all -> 0x00ae }
        L_0x0009:
            java.util.LinkedHashMap r2 = r7.zze     // Catch:{ all -> 0x00ae }
            boolean r3 = r2.containsKey(r8)     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x001f
            if (r10 != r1) goto L_0x001d
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzhey r8 = (com.google.android.gms.internal.ads.zzhey) r8     // Catch:{ all -> 0x00ae }
            r9 = 4
            r8.zze(r9)     // Catch:{ all -> 0x00ae }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.zzhey r1 = com.google.android.gms.internal.ads.zzhez.zzd()     // Catch:{ all -> 0x00ae }
            int r10 = com.google.android.gms.internal.ads.zzhex.zza(r10)     // Catch:{ all -> 0x00ae }
            if (r10 == 0) goto L_0x002c
            r1.zze(r10)     // Catch:{ all -> 0x00ae }
        L_0x002c:
            int r10 = r2.size()     // Catch:{ all -> 0x00ae }
            r1.zzb(r10)     // Catch:{ all -> 0x00ae }
            r1.zzd(r8)     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzhdx r10 = com.google.android.gms.internal.ads.zzhea.zzc()     // Catch:{ all -> 0x00ae }
            java.util.HashSet r3 = r7.zzk     // Catch:{ all -> 0x00ae }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r3 != 0) goto L_0x00a0
            if (r9 == 0) goto L_0x00a0
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x00ae }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00ae }
        L_0x004c:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x00a0
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00ae }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00ae }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0065
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00ae }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00ae }
            goto L_0x0067
        L_0x0065:
            java.lang.String r4 = ""
        L_0x0067:
            java.lang.Object r5 = r3.getValue()     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x0074
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00ae }
            goto L_0x0076
        L_0x0074:
            java.lang.String r3 = ""
        L_0x0076:
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = r4.toLowerCase(r5)     // Catch:{ all -> 0x00ae }
            java.util.HashSet r6 = r7.zzk     // Catch:{ all -> 0x00ae }
            boolean r5 = r6.contains(r5)     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x004c
            com.google.android.gms.internal.ads.zzhdv r5 = com.google.android.gms.internal.ads.zzhdw.zzc()     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzgxz r4 = com.google.android.gms.internal.ads.zzgxz.zzw(r4)     // Catch:{ all -> 0x00ae }
            r5.zza(r4)     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzgxz r3 = com.google.android.gms.internal.ads.zzgxz.zzw(r3)     // Catch:{ all -> 0x00ae }
            r5.zzb(r3)     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzgzh r3 = r5.zzbr()     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzhdw r3 = (com.google.android.gms.internal.ads.zzhdw) r3     // Catch:{ all -> 0x00ae }
            r10.zza(r3)     // Catch:{ all -> 0x00ae }
            goto L_0x004c
        L_0x00a0:
            com.google.android.gms.internal.ads.zzgzh r9 = r10.zzbr()     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzhea r9 = (com.google.android.gms.internal.ads.zzhea) r9     // Catch:{ all -> 0x00ae }
            r1.zzc(r9)     // Catch:{ all -> 0x00ae }
            r2.put(r8, r1)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x00ae:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxv.zze(java.lang.String, java.util.Map, int):void");
    }

    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zzh2 = zzgdn.zzh(Collections.emptyMap());
            zzbxq zzbxq = new zzbxq(this);
            zzgdy zzgdy = zzcaf.zzg;
            ListenableFuture zzn = zzgdn.zzn(zzh2, zzbxq, zzgdy);
            ListenableFuture zzo = zzgdn.zzo(zzn, 10, TimeUnit.SECONDS, zzcaf.zzd);
            zzgdn.zzr(zzn, new zzbxu(this, zzo), zzgdy);
            zzc.add(zzo);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[SYNTHETIC, Splitter:B:18:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxx r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L_0x0008
            goto L_0x0085
        L_0x0008:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L_0x0085
            com.google.android.gms.ads.internal.zzv.zzr()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x0073
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0036
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r4, r2)
        L_0x0036:
            if (r3 != 0) goto L_0x0072
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0069 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0069 }
            if (r2 == 0) goto L_0x0061
            if (r3 != 0) goto L_0x0045
            goto L_0x0061
        L_0x0045:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0069 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0069 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0069 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0069 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0069 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0069 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0069 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0069 }
            r1 = r4
            goto L_0x0073
        L_0x0061:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ RuntimeException -> 0x0069 }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r8)     // Catch:{ RuntimeException -> 0x0069 }
            goto L_0x0073
        L_0x0069:
            r8 = move-exception
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r8)
            goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            if (r1 != 0) goto L_0x007b
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxz.zza(r8)
            return
        L_0x007b:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbxr r8 = new com.google.android.gms.internal.ads.zzbxr
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.zzs.zzh(r8)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxv.zzg(android.view.View):void");
    }

    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
