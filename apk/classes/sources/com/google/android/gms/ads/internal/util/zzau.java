package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.webkit.internal.AssetHelper;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzdve;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzgdy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzau {
    private final Context zza;
    private final zzdvi zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context) {
        this.zzg = 0;
        this.zzl = new zzaf(this);
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        zzv.zzv().zzb();
        this.zzk = zzv.zzv().zza();
        this.zzb = zzv.zzu().zza();
    }

    public static /* synthetic */ void zza(zzau zzau) {
        zzay zzu = zzv.zzu();
        String str = zzau.zzd;
        String str2 = zzau.zze;
        String str3 = zzau.zzf;
        boolean zzm = zzu.zzm();
        Context context = zzau.zza;
        zzu.zzh(zzu.zzj(context, str, str2));
        if (zzu.zzm()) {
            if (!zzm && !TextUtils.isEmpty(str3)) {
                zzu.zze(context, str2, str3, str);
            }
            int i = zze.zza;
            zzo.zze("Device is linked for debug signals.");
            zzu.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzu.zzd(context, str, str2);
    }

    public static /* synthetic */ void zzc(zzau zzau, int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            Context context = zzau.zza;
            if (!(context instanceof Activity)) {
                int i7 = zze.zza;
                zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = zzau.zzc;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                zzv.zzr();
                Map zzQ = zzs.zzQ(build);
                for (String str3 : zzQ.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) zzQ.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            zzv.zzr();
            AlertDialog.Builder zzL = zzs.zzL(context);
            zzL.setMessage(str2);
            zzL.setTitle("Ad Information");
            zzL.setPositiveButton("Share", new zzah(zzau, str2));
            zzL.setNegativeButton("Close", new zzai());
            zzL.create().show();
        } else if (i6 == i2) {
            int i8 = zze.zza;
            zzo.zze("Debug mode [Creative Preview] selected.");
            zzcaf.zza.execute(new zzag(zzau));
        } else if (i6 == i3) {
            int i9 = zze.zza;
            zzo.zze("Debug mode [Troubleshooting] selected.");
            zzcaf.zza.execute(new zzat(zzau));
        } else if (i6 == i4) {
            zzdvi zzdvi = zzau.zzb;
            zzgdy zzgdy = zzcaf.zzf;
            zzgdy zzgdy2 = zzcaf.zza;
            if (zzdvi.zzq()) {
                zzgdy.execute(new zzar(zzau));
            } else {
                zzgdy2.execute(new zzas(zzau, zzgdy));
            }
        } else if (i6 == i5) {
            zzdvi zzdvi2 = zzau.zzb;
            zzgdy zzgdy3 = zzcaf.zzf;
            zzgdy zzgdy4 = zzcaf.zza;
            if (zzdvi2.zzq()) {
                zzgdy3.execute(new zzae(zzau));
            } else {
                zzgdy4.execute(new zzal(zzau, zzgdy3));
            }
        }
    }

    public static /* synthetic */ void zzd(zzau zzau, zzgdy zzgdy) {
        zzay zzu = zzv.zzu();
        Context context = zzau.zza;
        if (!zzu.zzj(context, zzau.zzd, zzau.zze)) {
            zzv.zzu().zzd(context, zzau.zzd, zzau.zze);
        } else {
            zzgdy.execute(new zzak(zzau));
        }
    }

    public static /* synthetic */ void zzf(zzau zzau, AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                zzau.zzb.zzm(zzdve.zzb);
            } else if (atomicInteger.get() == i3) {
                zzau.zzb.zzm(zzdve.zzc);
            } else {
                zzau.zzb.zzm(zzdve.zza);
            }
        }
        zzau.zzr();
    }

    public static /* synthetic */ void zzg(zzau zzau, String str, DialogInterface dialogInterface, int i) {
        zzv.zzr();
        zzs.zzU(zzau.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public static /* synthetic */ void zzi(zzau zzau) {
        zzau.zzg = 4;
        zzau.zzr();
    }

    public static /* synthetic */ void zzj(zzau zzau) {
        zzay zzu = zzv.zzu();
        Context context = zzau.zza;
        String str = zzau.zzd;
        String str2 = zzau.zze;
        if (!zzu.zzk(context, str, str2)) {
            zzu.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzu.zza)) {
            int i = zze.zza;
            zzo.zze("Creative is not pushed for this device.");
            zzu.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzu.zza)) {
            int i2 = zze.zza;
            zzo.zze("The app is not linked for creative preview.");
            zzu.zzd(context, str, str2);
        } else if ("0".equals(zzu.zza)) {
            int i3 = zze.zza;
            zzo.zze("Device is linked for in app preview.");
            zzu.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public static /* synthetic */ void zzl(zzau zzau, zzgdy zzgdy) {
        zzay zzu = zzv.zzu();
        Context context = zzau.zza;
        if (!zzu.zzj(context, zzau.zzd, zzau.zze)) {
            zzv.zzu().zzd(context, zzau.zzd, zzau.zze);
        } else {
            zzgdy.execute(new zzaj(zzau));
        }
    }

    /* access modifiers changed from: private */
    public final void zzs(Context context) {
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        int zzu2 = zzu(arrayList, "Shake", true);
        int zzu3 = zzu(arrayList, "Flick", true);
        int ordinal = this.zzb.zza().ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        zzv.zzr();
        AlertDialog.Builder zzL = zzs.zzL(context);
        AtomicInteger atomicInteger = new AtomicInteger(i);
        zzL.setTitle("Setup gesture");
        zzL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new zzan(atomicInteger));
        zzL.setNegativeButton("Dismiss", new zzao(this));
        zzL.setPositiveButton("Save", new zzap(this, atomicInteger, i, zzu2, zzu3));
        zzL.setOnCancelListener(new zzaq(this));
        zzL.create().show();
    }

    private final boolean zzt(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzi.x - f) < ((float) this.zzh) && Math.abs(this.zzi.y - f2) < ((float) this.zzh) && Math.abs(this.zzj.x - f3) < ((float) this.zzh) && Math.abs(this.zzj.y - f4) < ((float) this.zzh);
    }

    private static final int zzu(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzd);
        sb.append("}");
        return sb.toString();
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i != -1) {
            if (i == 0) {
                if (actionMasked == 5) {
                    this.zzg = 5;
                    this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.zzk.postDelayed(this.zzl, ((Long) zzbd.zzc().zzb(zzbde.zzfg)).longValue());
                }
            } else if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            z |= !zzt(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                        }
                        if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.zzg = -1;
                this.zzk.removeCallbacks(this.zzl);
            }
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            Context context = this.zza;
            if (!(context instanceof Activity)) {
                int i = zze.zza;
                zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(zzv.zzu().zzb())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != zzv.zzu().zzm()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int zzu = zzu(arrayList, "Ad information", true);
            int zzu2 = zzu(arrayList, str, true);
            int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbde.zzjE)).booleanValue();
            int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            zzv.zzr();
            AlertDialog.Builder zzL = zzs.zzL(context);
            zzL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzam(this, zzu, zzu2, zzu3, zzu4, zzu5));
            zzL.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
