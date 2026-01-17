package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzecl extends zzbti {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsj zzc;
    private final zzu zzd;
    private final zzeca zze;
    private String zzf;
    private String zzg;

    public zzecl(Context context, zzeca zzeca, zzu zzu, zzdsj zzdsj) {
        this.zzb = context;
        this.zzc = zzdsj;
        this.zzd = zzu;
        this.zze = zzeca;
    }

    public static /* synthetic */ void zzc(zzecl zzecl, zzm zzm, DialogInterface dialogInterface, int i) {
        zzecl.zze.zzc(zzecl.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzecl.zzw(zzecl.zzf, "rtsdc", hashMap);
        if (zzm != null) {
            zzm.zzb();
        }
    }

    public static /* synthetic */ void zzd(zzecl zzecl, zzm zzm, DialogInterface dialogInterface) {
        zzecl.zze.zzc(zzecl.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzecl.zzw(zzecl.zzf, "rtsdc", hashMap);
        if (zzm != null) {
            zzm.zzb();
        }
    }

    public static /* synthetic */ void zzk(zzecl zzecl, Activity activity, zzm zzm, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzecl.zzw(zzecl.zzf, "rtsdc", hashMap);
        activity.startActivity(zzv.zzs().zzf(activity));
        zzecl.zzx();
        if (zzm != null) {
            zzm.zzb();
        }
    }

    public static /* synthetic */ void zzl(zzecl zzecl, zzm zzm, DialogInterface dialogInterface, int i) {
        zzecl.zze.zzc(zzecl.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzecl.zzw(zzecl.zzf, "dialog_click", hashMap);
        if (zzm != null) {
            zzm.zzb();
        }
    }

    public static /* synthetic */ void zzm(zzecl zzecl, Activity activity, zzm zzm, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzecl.zzw(zzecl.zzf, "dialog_click", hashMap);
        zzecl.zzy(activity, zzm);
    }

    public static /* synthetic */ void zzn(zzecl zzecl, zzm zzm, DialogInterface dialogInterface) {
        zzecl.zze.zzc(zzecl.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzecl.zzw(zzecl.zzf, "dialog_click", hashMap);
        if (zzm != null) {
            zzm.zzb();
        }
    }

    public static void zzo(Context context, zzdsj zzdsj, zzeca zzeca, String str, String str2) {
        zzp(context, zzdsj, zzeca, str, str2, new HashMap());
    }

    public static void zzp(Context context, zzdsj zzdsj, zzeca zzeca, String str, String str2, Map map) {
        String str3;
        String str4 = true != zzv.zzp().zzA(context) ? "offline" : "online";
        if (zzdsj != null) {
            zzdsi zza2 = zzdsj.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            zza2.zzb("device_connectivity", str4);
            zza2.zzb("event_timestamp", String.valueOf(zzv.zzD().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza2.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza2.zze();
        } else {
            str3 = "";
        }
        zzeca.zzd(new zzecc(zzv.zzD().currentTimeMillis(), str, str3, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            ClipData clipData = zzfsk.zza;
            return zzfsk.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return zzfsk.zza(context, 0, intent, 201326592);
    }

    private final AlertDialog zzs(Activity activity, zzm zzm) {
        zzv.zzr();
        AlertDialog.Builder onCancelListener = zzs.zzL(activity).setOnCancelListener(new zzecd(zzm));
        XmlResourceParser zzt = zzt(R.layout.offline_ads_dialog);
        if (zzt == null) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            Drawable drawable = null;
            View inflate = activity.getLayoutInflater().inflate(zzt, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzu = zzu();
            if (!TextUtils.isEmpty(zzu)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzu);
            }
            zzebs zzebs = (zzebs) this.zza.get(this.zzf);
            if (zzebs != null) {
                drawable = zzebs.zza();
            }
            if (drawable != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser zzt(int i) {
        Resources zze2 = zzv.zzp().zze();
        if (zze2 == null) {
            return null;
        }
        try {
            return zze2.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzu() {
        zzebs zzebs = (zzebs) this.zza.get(this.zzf);
        return zzebs == null ? "" : zzebs.zzb();
    }

    private static String zzv(int i, String str) {
        Resources zze2 = zzv.zzp().zze();
        if (zze2 == null) {
            return str;
        }
        try {
            return zze2.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzp(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzx() {
        /*
            r7 = this;
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ RemoteException -> 0x003e }
            android.content.Context r0 = r7.zzb     // Catch:{ RemoteException -> 0x003e }
            com.google.android.gms.ads.internal.util.zzbr r1 = com.google.android.gms.ads.internal.util.zzs.zzA(r0)     // Catch:{ RemoteException -> 0x003e }
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch:{ RemoteException -> 0x003e }
            com.google.android.gms.ads.internal.offline.buffering.zza r3 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch:{ RemoteException -> 0x003e }
            java.lang.String r4 = r7.zzg     // Catch:{ RemoteException -> 0x003e }
            java.lang.String r5 = r7.zzf     // Catch:{ RemoteException -> 0x003e }
            java.util.Map r6 = r7.zza     // Catch:{ RemoteException -> 0x003e }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ RemoteException -> 0x003e }
            com.google.android.gms.internal.ads.zzebs r6 = (com.google.android.gms.internal.ads.zzebs) r6     // Catch:{ RemoteException -> 0x003e }
            if (r6 != 0) goto L_0x0020
            java.lang.String r6 = ""
            goto L_0x0024
        L_0x0020:
            java.lang.String r6 = r6.zzc()     // Catch:{ RemoteException -> 0x003e }
        L_0x0024:
            r3.<init>(r4, r5, r6)     // Catch:{ RemoteException -> 0x003e }
            boolean r2 = r1.zzg(r2, r3)     // Catch:{ RemoteException -> 0x003e }
            if (r2 != 0) goto L_0x003c
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch:{ RemoteException -> 0x003a }
            java.lang.String r3 = r7.zzg     // Catch:{ RemoteException -> 0x003a }
            java.lang.String r4 = r7.zzf     // Catch:{ RemoteException -> 0x003a }
            boolean r0 = r1.zzf(r0, r3, r4)     // Catch:{ RemoteException -> 0x003a }
            goto L_0x0048
        L_0x003a:
            r0 = move-exception
            goto L_0x0040
        L_0x003c:
            r0 = 1
            goto L_0x0048
        L_0x003e:
            r0 = move-exception
            r2 = 0
        L_0x0040:
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r1 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
            r0 = r2
        L_0x0048:
            if (r0 != 0) goto L_0x005c
            com.google.android.gms.internal.ads.zzeca r0 = r7.zze
            java.lang.String r1 = r7.zzf
            r0.zzc(r1)
            java.lang.String r0 = r7.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzfyt r2 = com.google.android.gms.internal.ads.zzfyt.zzd()
            r7.zzw(r0, r1, r2)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecl.zzx():void");
    }

    private final void zzy(Activity activity, zzm zzm) {
        zzv.zzr();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzx();
            zzz(activity, zzm);
        } else if (Build.VERSION.SDK_INT < 33) {
            zzv.zzr();
            AlertDialog.Builder zzL = zzs.zzL(activity);
            zzL.setTitle(zzv(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new zzece(this, activity, zzm)).setNegativeButton(zzv(R.string.notifications_permission_decline, "Don't allow"), new zzecf(this, zzm)).setOnCancelListener(new zzecg(this, zzm));
            zzL.create().show();
            zzw(this.zzf, "rtsdi", zzfyt.zzd());
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzw(this.zzf, "asnpdi", zzfyt.zzd());
        }
    }

    private final void zzz(Activity activity, zzm zzm) {
        AlertDialog zzs = zzs(activity, zzm);
        zzs.show();
        Timer timer = new Timer();
        timer.schedule(new zzeck(this, zzs, timer, zzm), 3000);
    }

    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            Context context = this.zzb;
            boolean zzA = zzv.zzp().zzA(context);
            HashMap hashMap = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == zzA) {
                    c = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzw(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (c == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzeca.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                int i = zze.zza;
                zzo.zzg(concat);
            }
        }
    }

    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        int i = 0;
        while (i < strArr.length) {
            if (!strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                i++;
            } else {
                zzecn zzecn = (zzecn) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza2 = zzecn.zza();
                zzm zzb2 = zzecn.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzx();
                    zzz(zza2, zzb2);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb2 != null) {
                        zzb2.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzecn zzecn = (zzecn) ObjectWrapper.unwrap(iObjectWrapper);
        Activity zza2 = zzecn.zza();
        zzm zzb2 = zzecn.zzb();
        this.zzf = zzecn.zzc();
        this.zzg = zzecn.zzd();
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zziQ)).booleanValue()) {
            zzw(this.zzf, "dialog_impression", zzfyt.zzd());
            zzv.zzr();
            AlertDialog.Builder zzL = zzs.zzL(zza2);
            zzL.setTitle(zzv(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(R.string.offline_opt_in_confirm, "OK"), new zzech(this, zza2, zzb2)).setNegativeButton(zzv(R.string.offline_opt_in_decline, "No thanks"), new zzeci(this, zzb2)).setOnCancelListener(new zzecj(this, zzb2));
            zzL.create().show();
            return;
        }
        zzy(zza2, zzb2);
    }

    public final void zzh() {
        this.zze.zze(new zzebt(this.zzd));
    }

    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new zza(str, str2, ""));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a9 A[SYNTHETIC, Splitter:B:13:0x00a9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r8, com.google.android.gms.ads.internal.offline.buffering.zza r9) {
        /*
            r7 = this;
            java.lang.Object r8 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r8)
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r0 = r9.zza
            java.lang.String r1 = r9.zzb
            java.lang.String r9 = r9.zzc
            java.lang.String r2 = r7.zzu()
            com.google.android.gms.ads.internal.util.zzaa r3 = com.google.android.gms.ads.internal.zzv.zzs()
            java.lang.String r4 = "offline_notification_channel"
            java.lang.String r5 = "AdMob Offline Notifications"
            r3.zzh(r8, r4, r5)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzr(r8, r3, r1, r0)
            java.lang.String r5 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzr(r8, r5, r1, r0)
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder
            r5.<init>(r8, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0046
            int r4 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r6 = "You are back online! Continue learning about %s"
            java.lang.String r4 = zzv(r4, r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r5.setContentTitle(r2)
            goto L_0x0051
        L_0x0046:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r4 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzv(r2, r4)
            r5.setContentTitle(r2)
        L_0x0051:
            r2 = 1
            androidx.core.app.NotificationCompat$Builder r2 = r5.setAutoCancel(r2)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setDeleteIntent(r0)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setContentIntent(r3)
            android.content.pm.ApplicationInfo r2 = r8.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.NotificationCompat$Builder r0 = r0.setSmallIcon(r2)
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zziR
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setPriority(r2)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zziT
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00a6
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x00a6 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x00a6 }
            java.net.URLConnection r9 = r0.openConnection()     // Catch:{ IOException -> 0x00a6 }
            java.io.InputStream r9 = r9.getInputStream()     // Catch:{ IOException -> 0x00a6 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00a7
        L_0x00a6:
            r9 = r2
        L_0x00a7:
            if (r9 == 0) goto L_0x00c0
            androidx.core.app.NotificationCompat$Builder r0 = r5.setLargeIcon(r9)     // Catch:{ NotFoundException -> 0x00c0 }
            androidx.core.app.NotificationCompat$BigPictureStyle r3 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ NotFoundException -> 0x00c0 }
            r3.<init>()     // Catch:{ NotFoundException -> 0x00c0 }
            androidx.core.app.NotificationCompat$BigPictureStyle r9 = r3.bigPicture(r9)     // Catch:{ NotFoundException -> 0x00c0 }
            r3 = r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ NotFoundException -> 0x00c0 }
            androidx.core.app.NotificationCompat$BigPictureStyle r9 = r9.bigLargeIcon(r2)     // Catch:{ NotFoundException -> 0x00c0 }
            r0.setStyle(r9)     // Catch:{ NotFoundException -> 0x00c0 }
        L_0x00c0:
            java.lang.String r9 = "notification"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            android.app.Notification r0 = r5.build()     // Catch:{ IllegalArgumentException -> 0x00da }
            r2 = 54321(0xd431, float:7.612E-41)
            r8.notify(r1, r2, r0)     // Catch:{ IllegalArgumentException -> 0x00da }
            java.lang.String r8 = "offline_notification_impression"
            goto L_0x00e6
        L_0x00da:
            r8 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r8 = r8.getMessage()
            r9.put(r0, r8)
            java.lang.String r8 = "offline_notification_failed"
        L_0x00e6:
            r7.zzw(r1, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecl.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    public final void zzq(String str, zzdit zzdit) {
        String zzx = zzdit.zzx();
        String zzB = zzdit.zzB();
        String str2 = "";
        if (TextUtils.isEmpty(zzx)) {
            zzx = zzB != null ? zzB : str2;
        }
        zzbgp zzm = zzdit.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbgp zzn = zzdit.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf2 = zzn.zzf();
                if (zzf2 != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zzf2);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzebo(zzx, str2, drawable));
    }
}
