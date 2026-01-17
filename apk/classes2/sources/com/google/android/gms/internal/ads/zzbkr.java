package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbkr implements zzbkf {
    private final zzb zza;
    private final zzdsj zzb;
    private zzu zzc = null;
    private final zzbso zzd;
    private final zzeca zze;
    private final zzcmq zzf;
    private zzaa zzg = null;
    private final zzgdy zzh = zzcaf.zzg;

    public zzbkr(zzb zzb2, zzbso zzbso, zzeca zzeca, zzdsj zzdsj, zzcmq zzcmq) {
        this.zza = zzb2;
        this.zzd = zzbso;
        this.zze = zzeca;
        this.zzb = zzdsj;
        this.zzf = zzcmq;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzavu zzavu, Uri uri, View view, Activity activity, zzfda zzfda) {
        if (zzavu == null) {
            return uri;
        }
        try {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzmu)).booleanValue() || zzfda == null) {
                if (zzavu.zze(uri)) {
                    return zzavu.zza(uri, context, view, activity);
                }
                return uri;
            } else if (zzavu.zze(uri)) {
                return zzfda.zza(uri, context, view, activity);
            } else {
                return uri;
            }
        } catch (zzavv unused) {
            return uri;
        } catch (Exception e) {
            zzv.zzp().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            int i = zze.zza;
            zzo.zzh("Error adding click uptime parameter to url: ".concat(valueOf), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* access modifiers changed from: private */
    public final void zzh(String str, zza zza2, Map map, String str2) {
        String str3;
        boolean z;
        HashMap hashMap;
        Object obj;
        Object obj2;
        boolean z2;
        zza zza3 = zza2;
        Map map2 = map;
        String str4 = str2;
        zzcfg zzcfg = (zzcfg) zza3;
        zzfca zzD = zzcfg.zzD();
        zzfcd zzR = zzcfg.zzR();
        boolean z3 = false;
        if (zzD == null || zzR == null) {
            str3 = "";
            z = false;
        } else {
            String str5 = zzR.zzb;
            z = zzD.zzb();
            str3 = str5;
        }
        boolean z4 = !((Boolean) zzbd.zzc().zzb(zzbde.zzlg)).booleanValue() || !map2.containsKey("sc") || !((String) map2.get("sc")).equals("0");
        boolean z5 = ((Boolean) zzbd.zzc().zzb(zzbde.zzng)).booleanValue() && map2.containsKey("ig_cl") && ((String) map2.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str4)) {
            if (zzcfg.zzaF()) {
                int i = zze.zza;
                zzo.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzk(false);
            ((zzcgq) zza3).zzaL(zzf(map), zzb(map), z4);
        } else if ("webapp".equalsIgnoreCase(str4)) {
            zzk(false);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzmq)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1")) {
                z3 = true;
            }
            if (str != null) {
                ((zzcgq) zza3).zzaN(zzf(map), zzb(map), str, z4, z3);
            } else {
                ((zzcgq) zza3).zzaM(zzf(map), zzb(map), (String) map2.get("html"), (String) map2.get("baseurl"), z4);
            }
        } else {
            Intent intent = null;
            if ("chrome_custom_tab".equalsIgnoreCase(str4)) {
                Context context = zzcfg.getContext();
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzeY)).booleanValue()) {
                    zze.zza("User opt out chrome custom tab.");
                    zzm(10);
                } else {
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzeT)).booleanValue()) {
                        int i2 = zzbed.zza;
                        String packageName = CustomTabsClient.getPackageName(context, (List) null);
                        if (packageName != null && !context.getPackageName().equals(packageName)) {
                            z3 = true;
                        }
                    } else {
                        z3 = zzbef.zzg(context);
                    }
                    if (!z3) {
                        zzm(4);
                    } else {
                        zzk(true);
                        if (TextUtils.isEmpty(str)) {
                            int i3 = zze.zza;
                            zzo.zzj("Cannot open browser with null or empty url");
                            zzm(7);
                            return;
                        }
                        Uri zzd2 = zzd(zzc(zzcfg.getContext(), zzcfg.zzI(), Uri.parse(str), zzcfg.zzF(), zzcfg.zzi(), zzcfg.zzS()));
                        if (!z || this.zze == null || !zzl(zza3, zzcfg.getContext(), zzd2.toString(), str3)) {
                            this.zzg = new zzbko(this);
                            ((zzcgq) zza3).zzaJ(new zzc((String) null, zzd2.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (Intent) null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z4, z5, str3);
                            return;
                        }
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                zzj(zza2, map, z, str3, z4, z5);
            } else if ("app".equalsIgnoreCase(str4) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
                zzj(zza2, map, z, str3, z4, z5);
            } else if ("open_app".equalsIgnoreCase(str4)) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zziE)).booleanValue()) {
                    zzk(true);
                    String str6 = (String) map2.get("p");
                    if (str6 == null) {
                        int i4 = zze.zza;
                        zzo.zzj("Package name missing from open app action.");
                    } else if (!z || this.zze == null || !zzl(zza3, zzcfg.getContext(), str6, str3)) {
                        PackageManager packageManager = zzcfg.getContext().getPackageManager();
                        if (packageManager == null) {
                            int i5 = zze.zza;
                            zzo.zzj("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                        if (launchIntentForPackage != null) {
                            ((zzcgq) zza3).zzaJ(new zzc(launchIntentForPackage, this.zzg), z4, z5, str3);
                        }
                    }
                }
            } else {
                zzk(true);
                String str7 = (String) map2.get("intent_url");
                if (!TextUtils.isEmpty(str7)) {
                    try {
                        intent = Intent.parseUri(str7, 0);
                    } catch (URISyntaxException e) {
                        URISyntaxException uRISyntaxException = e;
                        String valueOf = String.valueOf(str7);
                        int i6 = zze.zza;
                        zzo.zzh("Error parsing the url: ".concat(valueOf), uRISyntaxException);
                    }
                }
                Intent intent2 = intent;
                if (!(intent2 == null || intent2.getData() == null)) {
                    Uri data = intent2.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri zzd3 = zzd(zzc(zzcfg.getContext(), zzcfg.zzI(), data, zzcfg.zzF(), zzcfg.zzi(), zzcfg.zzS()));
                        if (!TextUtils.isEmpty(intent2.getType())) {
                            if (((Boolean) zzbd.zzc().zzb(zzbde.zziF)).booleanValue()) {
                                intent2.setDataAndType(zzd3, intent2.getType());
                            }
                        }
                        intent2.setData(zzd3);
                    }
                }
                boolean z6 = ((Boolean) zzbd.zzc().zzb(zzbde.zzja)).booleanValue() && "intent_async".equalsIgnoreCase(str4) && map2.containsKey("event_id");
                HashMap hashMap2 = new HashMap();
                if (z6) {
                    zzaa zzaa = r1;
                    hashMap = hashMap2;
                    obj = "p";
                    obj2 = "event_id";
                    zzaa zzbkp = new zzbkp(this, z4, zza2, hashMap, map);
                    this.zzg = zzaa;
                    z2 = false;
                } else {
                    hashMap = hashMap2;
                    obj2 = "event_id";
                    obj = "p";
                    z2 = z4;
                }
                if (intent2 == null) {
                    HashMap hashMap3 = hashMap;
                    String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcfg.getContext(), zzcfg.zzI(), Uri.parse(str), zzcfg.zzF(), zzcfg.zzi(), zzcfg.zzS())).toString() : str;
                    if (!z || this.zze == null || !zzl(zza3, zzcfg.getContext(), uri, str3)) {
                        ((zzcgq) zza3).zzaJ(new zzc((String) map2.get("i"), uri, (String) map2.get("m"), (String) map2.get(obj), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzg), z2, z5, str3);
                    } else if (z6) {
                        hashMap3.put((String) map2.get(obj2), true);
                        ((zzbna) zza3).zzd("openIntentAsync", hashMap3);
                    }
                } else if (!z || this.zze == null || !zzl(zza3, zzcfg.getContext(), intent2.getData().toString(), str3)) {
                    ((zzcgq) zza3).zzaJ(new zzc(intent2, this.zzg), z2, z5, str3);
                } else if (z6) {
                    HashMap hashMap4 = hashMap;
                    hashMap4.put((String) map2.get(obj2), true);
                    ((zzbna) zza3).zzd("openIntentAsync", hashMap4);
                }
            }
        }
    }

    private final void zzi(Context context, String str, String str2) {
        zzeca zzeca = this.zze;
        zzeca.zzc(str);
        zzdsj zzdsj = this.zzb;
        if (zzdsj != null) {
            zzecl.zzp(context, zzdsj, zzeca, str, "dialog_not_shown", zzfyt.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: android.content.Intent} */
    /* JADX WARNING: type inference failed for: r17v1, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r17v6, types: [android.net.Uri] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0108, code lost:
        if (com.google.android.gms.internal.ads.zzbkq.zzc(r2, r12, r13, r14, r15) == null) goto L_0x010a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r24
            r4 = 1
            r1.zzk(r4)
            r5 = r0
            com.google.android.gms.internal.ads.zzcfg r5 = (com.google.android.gms.internal.ads.zzcfg) r5
            android.content.Context r12 = r5.getContext()
            com.google.android.gms.internal.ads.zzavu r13 = r5.zzI()
            android.view.View r14 = r5.zzF()
            com.google.android.gms.internal.ads.zzfda r15 = r5.zzS()
            java.lang.String r6 = "activity"
            java.lang.Object r6 = r12.getSystemService(r6)
            r16 = r6
            android.app.ActivityManager r16 = (android.app.ActivityManager) r16
            java.lang.String r6 = "u"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r17 = 0
            if (r7 == 0) goto L_0x003d
        L_0x0039:
            r2 = r17
            goto L_0x0174
        L_0x003d:
            android.net.Uri r8 = android.net.Uri.parse(r6)
            r10 = 0
            r6 = r12
            r7 = r13
            r9 = r14
            r11 = r15
            android.net.Uri r6 = zzc(r6, r7, r8, r9, r10, r11)
            android.net.Uri r6 = zzd(r6)
            java.lang.String r7 = "use_first_package"
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r18 = java.lang.Boolean.parseBoolean(r7)
            java.lang.String r7 = "use_running_process"
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r19 = java.lang.Boolean.parseBoolean(r7)
            java.lang.String r7 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r11 = 0
            if (r2 != 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzeP
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r7.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = r11
        L_0x0089:
            java.lang.String r2 = r6.getScheme()
            java.lang.String r7 = "http"
            boolean r2 = r7.equalsIgnoreCase(r2)
            java.lang.String r8 = "https"
            if (r2 == 0) goto L_0x00a6
            android.net.Uri$Builder r2 = r6.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r8)
            android.net.Uri r17 = r2.build()
        L_0x00a3:
            r2 = r17
            goto L_0x00bd
        L_0x00a6:
            java.lang.String r2 = r6.getScheme()
            boolean r2 = r8.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a3
            android.net.Uri$Builder r2 = r6.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r7)
            android.net.Uri r17 = r2.build()
            goto L_0x00a3
        L_0x00bd:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            android.content.Intent r9 = com.google.android.gms.internal.ads.zzbkq.zza(r6, r12, r13, r14, r15)
            android.content.Intent r2 = com.google.android.gms.internal.ads.zzbkq.zza(r2, r12, r13, r14, r15)
            if (r4 == 0) goto L_0x00d8
            com.google.android.gms.ads.internal.zzv.zzr()
            com.google.android.gms.ads.internal.util.zzs.zzp(r12, r9)
            com.google.android.gms.ads.internal.zzv.zzr()
            com.google.android.gms.ads.internal.util.zzs.zzp(r12, r2)
        L_0x00d8:
            r6 = r9
            r7 = r10
            r8 = r12
            r4 = r9
            r9 = r13
            r22 = r10
            r10 = r14
            r0 = r11
            r11 = r15
            android.content.pm.ResolveInfo r7 = com.google.android.gms.internal.ads.zzbkq.zzd(r6, r7, r8, r9, r10, r11)
            if (r7 == 0) goto L_0x00f3
            r6 = r4
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            android.content.Intent r17 = com.google.android.gms.internal.ads.zzbkq.zzb(r6, r7, r8, r9, r10, r11)
            goto L_0x0039
        L_0x00f3:
            if (r2 == 0) goto L_0x010a
            android.content.pm.ResolveInfo r7 = com.google.android.gms.internal.ads.zzbkq.zzc(r2, r12, r13, r14, r15)
            if (r7 == 0) goto L_0x010a
            r6 = r4
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            android.content.Intent r2 = com.google.android.gms.internal.ads.zzbkq.zzb(r6, r7, r8, r9, r10, r11)
            android.content.pm.ResolveInfo r6 = com.google.android.gms.internal.ads.zzbkq.zzc(r2, r12, r13, r14, r15)
            if (r6 != 0) goto L_0x0174
        L_0x010a:
            boolean r2 = r22.isEmpty()
            if (r2 == 0) goto L_0x0112
            goto L_0x0173
        L_0x0112:
            if (r19 == 0) goto L_0x015c
            if (r16 == 0) goto L_0x015c
            java.util.List r2 = r16.getRunningAppProcesses()
            if (r2 == 0) goto L_0x015c
            int r6 = r22.size()
            r11 = r0
        L_0x0121:
            if (r11 >= r6) goto L_0x015c
            r7 = r22
            java.lang.Object r8 = r7.get(r11)
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            java.util.Iterator r9 = r2.iterator()
        L_0x012f:
            boolean r10 = r9.hasNext()
            int r16 = r11 + 1
            if (r10 == 0) goto L_0x0157
            java.lang.Object r10 = r9.next()
            android.app.ActivityManager$RunningAppProcessInfo r10 = (android.app.ActivityManager.RunningAppProcessInfo) r10
            java.lang.String r10 = r10.processName
            android.content.pm.ActivityInfo r0 = r8.activityInfo
            java.lang.String r0 = r0.packageName
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0155
            r6 = r4
            r7 = r8
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            android.content.Intent r17 = com.google.android.gms.internal.ads.zzbkq.zzb(r6, r7, r8, r9, r10, r11)
            goto L_0x0039
        L_0x0155:
            r0 = 0
            goto L_0x012f
        L_0x0157:
            r22 = r7
            r11 = r16
            goto L_0x0121
        L_0x015c:
            r7 = r22
            if (r18 == 0) goto L_0x0173
            r0 = 0
            java.lang.Object r0 = r7.get(r0)
            r7 = r0
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            r6 = r4
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            android.content.Intent r17 = com.google.android.gms.internal.ads.zzbkq.zzb(r6, r7, r8, r9, r10, r11)
            goto L_0x0039
        L_0x0173:
            r2 = r4
        L_0x0174:
            if (r23 == 0) goto L_0x0192
            com.google.android.gms.internal.ads.zzeca r0 = r1.zze
            if (r0 == 0) goto L_0x0192
            if (r2 == 0) goto L_0x0192
            android.content.Context r0 = r5.getContext()
            android.net.Uri r4 = r2.getData()
            java.lang.String r4 = r4.toString()
            r5 = r21
            boolean r0 = r1.zzl(r5, r0, r4, r3)
            if (r0 != 0) goto L_0x0191
            goto L_0x0194
        L_0x0191:
            return
        L_0x0192:
            r5 = r21
        L_0x0194:
            r0 = r5
            com.google.android.gms.internal.ads.zzcgq r0 = (com.google.android.gms.internal.ads.zzcgq) r0     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            com.google.android.gms.ads.internal.overlay.zzc r4 = new com.google.android.gms.ads.internal.overlay.zzc     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            com.google.android.gms.ads.internal.overlay.zzaa r5 = r1.zzg     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            r4.<init>(r2, r5)     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            r2 = r25
            r5 = r26
            r0.zzaJ(r4, r2, r5, r3)     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            return
        L_0x01a6:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkr.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z) {
        zzbso zzbso = this.zzd;
        if (zzbso != null) {
            zzbso.zzb(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r5 = r3.zzay;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zziU)).booleanValue() != false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d8, code lost:
        if (r5 != false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzdsj r0 = r9.zzb
            if (r0 == 0) goto L_0x000b
            com.google.android.gms.internal.ads.zzeca r1 = r9.zze
            java.lang.String r2 = "offline_open"
            com.google.android.gms.internal.ads.zzecl.zzo(r11, r0, r1, r13, r2)
        L_0x000b:
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()
            boolean r0 = r0.zzA(r11)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002e
            com.google.android.gms.ads.internal.util.client.zzu r10 = r9.zzc
            if (r10 != 0) goto L_0x0026
            com.google.android.gms.ads.internal.util.client.zzu r10 = new com.google.android.gms.ads.internal.util.client.zzu
            android.content.Context r11 = r11.getApplicationContext()
            r10.<init>(r11, r1)
            r9.zzc = r10
        L_0x0026:
            com.google.android.gms.internal.ads.zzeca r10 = r9.zze
            com.google.android.gms.ads.internal.util.client.zzu r11 = r9.zzc
            r10.zzh(r11, r13)
            return r2
        L_0x002e:
            r0 = r10
            com.google.android.gms.internal.ads.zzcfg r0 = (com.google.android.gms.internal.ads.zzcfg) r0
            com.google.android.gms.internal.ads.zzfca r3 = r0.zzD()
            r4 = 1
            if (r3 == 0) goto L_0x0044
            com.google.android.gms.ads.internal.util.client.zzw r5 = r3.zzay
            if (r5 == 0) goto L_0x0044
            boolean r5 = r5.zzc()
            if (r5 != 0) goto L_0x0044
            r5 = r4
            goto L_0x0045
        L_0x0044:
            r5 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.zzbtw r3 = r3.zzad
            if (r3 == 0) goto L_0x0059
            boolean r6 = r3.zza
            if (r6 == 0) goto L_0x0059
            java.lang.String r6 = r3.zzb
            if (r6 == 0) goto L_0x0059
            boolean r3 = r3.zzc
            if (r3 == 0) goto L_0x0059
            r3 = r4
            goto L_0x005a
        L_0x0059:
            r3 = r2
        L_0x005a:
            if (r5 != 0) goto L_0x0152
            if (r3 == 0) goto L_0x0072
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zziU
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r5.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0072
            goto L_0x0152
        L_0x0072:
            com.google.android.gms.ads.internal.zzv.zzr()
            com.google.android.gms.ads.internal.util.zzbr r3 = com.google.android.gms.ads.internal.util.zzs.zzA(r11)
            com.google.android.gms.ads.internal.zzv.zzr()
            androidx.core.app.NotificationManagerCompat r5 = androidx.core.app.NotificationManagerCompat.from(r11)
            boolean r5 = r5.areNotificationsEnabled()
            java.lang.String r6 = "offline_notification_channel"
            com.google.android.gms.ads.internal.util.zzaa r7 = com.google.android.gms.ads.internal.zzv.zzs()
            boolean r6 = r7.zzi(r11, r6)
            com.google.android.gms.internal.ads.zzchd r7 = r0.zzO()
            boolean r7 = r7.zzi()
            if (r7 == 0) goto L_0x00a0
            android.app.Activity r7 = r0.zzi()
            if (r7 != 0) goto L_0x00a0
            r7 = r4
            goto L_0x00a1
        L_0x00a0:
            r7 = r2
        L_0x00a1:
            if (r5 != 0) goto L_0x00e1
            com.google.android.gms.ads.internal.zzv.zzr()
            androidx.core.app.NotificationManagerCompat r5 = androidx.core.app.NotificationManagerCompat.from(r11)
            boolean r5 = r5.areNotificationsEnabled()
            if (r5 == 0) goto L_0x00b1
            goto L_0x00db
        L_0x00b1:
            int r5 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r5 >= r8) goto L_0x00c8
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zziP
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r8.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x00d8
        L_0x00c8:
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zziO
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r8.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
        L_0x00d8:
            if (r5 == 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            java.lang.String r10 = "notifications_disabled"
            r9.zzi(r11, r13, r10)
            return r2
        L_0x00e1:
            if (r6 == 0) goto L_0x00e9
            java.lang.String r10 = "notification_channel_disabled"
            r9.zzi(r11, r13, r10)
            return r2
        L_0x00e9:
            if (r3 != 0) goto L_0x00f1
            java.lang.String r10 = "work_manager_unavailable"
            r9.zzi(r11, r13, r10)
            return r2
        L_0x00f1:
            if (r7 == 0) goto L_0x00f9
            java.lang.String r10 = "ad_no_activity"
            r9.zzi(r11, r13, r10)
            return r2
        L_0x00f9:
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zziM
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r5.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0111
            java.lang.String r10 = "notification_flow_disabled"
            r9.zzi(r11, r13, r10)
            return r2
        L_0x0111:
            com.google.android.gms.ads.internal.overlay.zzm r3 = r0.zzL()
            if (r3 == 0) goto L_0x0146
            android.app.Activity r3 = r0.zzi()
            if (r3 == 0) goto L_0x0146
            com.google.android.gms.internal.ads.zzecm r3 = com.google.android.gms.internal.ads.zzecn.zze()
            android.app.Activity r5 = r0.zzi()
            r3.zza(r5)
            r3.zzb(r1)
            r3.zzc(r13)
            r3.zzd(r12)
            com.google.android.gms.internal.ads.zzecn r12 = r3.zze()
            com.google.android.gms.ads.internal.overlay.zzm r0 = r0.zzL()     // Catch:{ Exception -> 0x013d }
            r0.zzf(r12)     // Catch:{ Exception -> 0x013d }
            goto L_0x014e
        L_0x013d:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            r9.zzi(r11, r13, r10)
            return r2
        L_0x0146:
            r11 = r10
            com.google.android.gms.internal.ads.zzcgq r11 = (com.google.android.gms.internal.ads.zzcgq) r11
            r0 = 14
            r11.zzaK(r13, r12, r0)
        L_0x014e:
            r10.onAdClicked()
            return r4
        L_0x0152:
            com.google.android.gms.internal.ads.zzdsj r10 = r9.zzb
            if (r10 == 0) goto L_0x015d
            com.google.android.gms.internal.ads.zzeca r12 = r9.zze
            java.lang.String r0 = "onfs"
            com.google.android.gms.internal.ads.zzecl.zzo(r11, r10, r12, r13, r0)
        L_0x015d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkr.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public final void zzm(int i) {
        zzdsj zzdsj;
        String str;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzeS)).booleanValue() && (zzdsj = this.zzb) != null) {
            zzdsi zza2 = zzdsj.zza();
            zza2.zzb("action", "cct_action");
            switch (i) {
                case 2:
                    str = "CONTEXT_NOT_AN_ACTIVITY";
                    break;
                case 3:
                    str = "CONTEXT_NULL";
                    break;
                case 4:
                    str = "CCT_NOT_SUPPORTED";
                    break;
                case 5:
                    str = "CCT_READY_TO_OPEN";
                    break;
                case 6:
                    str = "ACTIVITY_NOT_FOUND";
                    break;
                case 7:
                    str = "EMPTY_URL";
                    break;
                case 8:
                    str = "UNKNOWN";
                    break;
                case 9:
                    str = "WRONG_EXP_SETUP";
                    break;
                default:
                    str = "OPT_OUT";
                    break;
            }
            zza2.zzb("cct_open_status", str);
            zza2.zzj();
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ListenableFuture listenableFuture;
        zzcmq zzcmq;
        zzcfg zzcfg = (zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcfg zzcfg2 = zzcfg;
        if (zzcfg2.zzD() != null) {
            hashMap = zzcfg2.zzD().zzaw;
        }
        String zzc2 = zzbyq.zzc(str, zzcfg2.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = zze.zza;
            zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzb2 = this.zza;
        if (zzb2 == null || zzb2.zzc()) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkx)).booleanValue() || (zzcmq = this.zzf) == null || !zzcmq.zzj(zzc2)) {
                listenableFuture = zzgdn.zzh(zzc2);
            } else {
                listenableFuture = zzcmq.zze(zzc2, zzbb.zze());
            }
            zzgdn.zzr(listenableFuture, new zzbkn(this, map, zzcfg, str2), this.zzh);
            return;
        }
        zzb2.zzb(zzc2);
    }
}
