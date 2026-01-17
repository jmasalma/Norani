package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzayu;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzbw extends zzayu implements zzbx {
    public zzbw() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbx zzaf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: com.google.android.gms.ads.internal.client.zzcs} */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.google.android.gms.ads.internal.client.zzbk] */
    /* JADX WARNING: type inference failed for: r6v7, types: [com.google.android.gms.ads.internal.client.zzco] */
    /* JADX WARNING: type inference failed for: r6v13, types: [com.google.android.gms.ads.internal.client.zzbh] */
    /* JADX WARNING: type inference failed for: r6v23, types: [com.google.android.gms.ads.internal.client.zzcb] */
    /* JADX WARNING: type inference failed for: r6v28, types: [com.google.android.gms.ads.internal.client.zzdt] */
    /* JADX WARNING: type inference failed for: r6v33, types: [com.google.android.gms.ads.internal.client.zzbn] */
    /* JADX WARNING: type inference failed for: r6v38, types: [com.google.android.gms.ads.internal.client.zzcv] */
    /* JADX WARNING: type inference failed for: r6v43 */
    /* JADX WARNING: type inference failed for: r6v44 */
    /* JADX WARNING: type inference failed for: r6v45 */
    /* JADX WARNING: type inference failed for: r6v46 */
    /* JADX WARNING: type inference failed for: r6v47 */
    /* JADX WARNING: type inference failed for: r6v48 */
    /* JADX WARNING: type inference failed for: r6v49 */
    /* JADX WARNING: type inference failed for: r6v50 */
    /* JADX WARNING: type inference failed for: r6v51 */
    /* JADX WARNING: type inference failed for: r6v52 */
    /* JADX WARNING: type inference failed for: r6v53 */
    /* JADX WARNING: type inference failed for: r6v54 */
    /* JADX WARNING: type inference failed for: r6v55 */
    /* JADX WARNING: type inference failed for: r6v56 */
    /* JADX WARNING: type inference failed for: r6v57 */
    /* JADX WARNING: type inference failed for: r6v58 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzde(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 0
            switch(r3) {
                case 1: goto L_0x031a;
                case 2: goto L_0x0313;
                case 3: goto L_0x0306;
                case 4: goto L_0x02f0;
                case 5: goto L_0x02e9;
                case 6: goto L_0x02e2;
                case 7: goto L_0x02bf;
                case 8: goto L_0x029c;
                case 9: goto L_0x0294;
                case 10: goto L_0x028f;
                case 11: goto L_0x0287;
                case 12: goto L_0x027b;
                case 13: goto L_0x0268;
                case 14: goto L_0x0255;
                case 15: goto L_0x023e;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x0232;
                case 19: goto L_0x021f;
                case 20: goto L_0x01fb;
                case 21: goto L_0x01d7;
                case 22: goto L_0x01c8;
                case 23: goto L_0x01ba;
                case 24: goto L_0x01a7;
                case 25: goto L_0x0198;
                case 26: goto L_0x018c;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x0179;
                case 30: goto L_0x0166;
                case 31: goto L_0x015a;
                case 32: goto L_0x014e;
                case 33: goto L_0x0142;
                case 34: goto L_0x0133;
                case 35: goto L_0x0127;
                case 36: goto L_0x0103;
                case 37: goto L_0x00f7;
                case 38: goto L_0x00e8;
                case 39: goto L_0x00d5;
                case 40: goto L_0x00c2;
                case 41: goto L_0x00b6;
                case 42: goto L_0x0092;
                case 43: goto L_0x0066;
                case 44: goto L_0x0053;
                case 45: goto L_0x002f;
                case 46: goto L_0x0021;
                case 47: goto L_0x0015;
                case 48: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r3 = 0
            return r3
        L_0x0006:
            long r0 = r4.readLong()
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzR(r0)
            r5.writeNoException()
            goto L_0x0324
        L_0x0015:
            long r3 = r2.zzc()
            r5.writeNoException()
            r5.writeLong(r3)
            goto L_0x0324
        L_0x0021:
            boolean r3 = r2.zzaa()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayv.zza
            r5.writeInt(r3)
            goto L_0x0324
        L_0x002f:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0036
            goto L_0x0048
        L_0x0036:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzcv
            if (r0 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.client.zzcv r6 = (com.google.android.gms.ads.internal.client.zzcv) r6
            goto L_0x0048
        L_0x0043:
            com.google.android.gms.ads.internal.client.zzct r6 = new com.google.android.gms.ads.internal.client.zzct
            r6.<init>(r3)
        L_0x0048:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzK(r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x0053:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzY(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x0066:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzm r3 = (com.google.android.gms.ads.internal.client.zzm) r3
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0075
            goto L_0x0087
        L_0x0075:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAdLoadCallback"
            android.os.IInterface r6 = r0.queryLocalInterface(r6)
            boolean r1 = r6 instanceof com.google.android.gms.ads.internal.client.zzbn
            if (r1 == 0) goto L_0x0082
            com.google.android.gms.ads.internal.client.zzbn r6 = (com.google.android.gms.ads.internal.client.zzbn) r6
            goto L_0x0087
        L_0x0082:
            com.google.android.gms.ads.internal.client.zzbl r6 = new com.google.android.gms.ads.internal.client.zzbl
            r6.<init>(r0)
        L_0x0087:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzz(r3, r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x0092:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0099
            goto L_0x00ab
        L_0x0099:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzdt
            if (r0 == 0) goto L_0x00a6
            com.google.android.gms.ads.internal.client.zzdt r6 = (com.google.android.gms.ads.internal.client.zzdt) r6
            goto L_0x00ab
        L_0x00a6:
            com.google.android.gms.ads.internal.client.zzdr r6 = new com.google.android.gms.ads.internal.client.zzdr
            r6.<init>(r3)
        L_0x00ab:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzQ(r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x00b6:
            com.google.android.gms.ads.internal.client.zzea r3 = r2.zzl()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x0324
        L_0x00c2:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbaz r3 = com.google.android.gms.internal.ads.zzbay.zze(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzI(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x00d5:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzx> r3 = com.google.android.gms.ads.internal.client.zzx.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzx r3 = (com.google.android.gms.ads.internal.client.zzx) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzJ(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x00e8:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzT(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x00f7:
            android.os.Bundle r3 = r2.zze()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzf(r5, r3)
            goto L_0x0324
        L_0x0103:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x010a
            goto L_0x011c
        L_0x010a:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzcb
            if (r0 == 0) goto L_0x0117
            com.google.android.gms.ads.internal.client.zzcb r6 = (com.google.android.gms.ads.internal.client.zzcb) r6
            goto L_0x011c
        L_0x0117:
            com.google.android.gms.ads.internal.client.zzbz r6 = new com.google.android.gms.ads.internal.client.zzbz
            r6.<init>(r3)
        L_0x011c:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzF(r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x0127:
            java.lang.String r3 = r2.zzu()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0324
        L_0x0133:
            boolean r3 = com.google.android.gms.internal.ads.zzayv.zzh(r4)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzM(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x0142:
            com.google.android.gms.ads.internal.client.zzbk r3 = r2.zzj()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x0324
        L_0x014e:
            com.google.android.gms.ads.internal.client.zzco r3 = r2.zzk()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x0324
        L_0x015a:
            java.lang.String r3 = r2.zzs()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0324
        L_0x0166:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzeh> r3 = com.google.android.gms.ads.internal.client.zzeh.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzeh r3 = (com.google.android.gms.ads.internal.client.zzeh) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzL(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x0179:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzgc> r3 = com.google.android.gms.ads.internal.client.zzgc.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzgc r3 = (com.google.android.gms.ads.internal.client.zzgc) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzW(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x018c:
            com.google.android.gms.ads.internal.client.zzed r3 = r2.zzm()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
            goto L_0x0324
        L_0x0198:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzV(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x01a7:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbwi r3 = com.google.android.gms.internal.ads.zzbwh.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzU(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x01ba:
            boolean r3 = r2.zzab()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayv.zza
            r5.writeInt(r3)
            goto L_0x0324
        L_0x01c8:
            boolean r3 = com.google.android.gms.internal.ads.zzayv.zzh(r4)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzO(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x01d7:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x01de
            goto L_0x01f0
        L_0x01de:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzcs
            if (r0 == 0) goto L_0x01eb
            com.google.android.gms.ads.internal.client.zzcs r6 = (com.google.android.gms.ads.internal.client.zzcs) r6
            goto L_0x01f0
        L_0x01eb:
            com.google.android.gms.ads.internal.client.zzcs r6 = new com.google.android.gms.ads.internal.client.zzcs
            r6.<init>(r3)
        L_0x01f0:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzae(r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x01fb:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0202
            goto L_0x0214
        L_0x0202:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzbh
            if (r0 == 0) goto L_0x020f
            com.google.android.gms.ads.internal.client.zzbh r6 = (com.google.android.gms.ads.internal.client.zzbh) r6
            goto L_0x0214
        L_0x020f:
            com.google.android.gms.ads.internal.client.zzbf r6 = new com.google.android.gms.ads.internal.client.zzbf
            r6.<init>(r3)
        L_0x0214:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzD(r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x021f:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbdz r3 = com.google.android.gms.internal.ads.zzbdy.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzP(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x0232:
            java.lang.String r3 = r2.zzt()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0324
        L_0x023e:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbuc r3 = com.google.android.gms.internal.ads.zzbub.zzb(r3)
            java.lang.String r6 = r4.readString()
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzS(r3, r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x0255:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzbtz r3 = com.google.android.gms.internal.ads.zzbty.zzb(r3)
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzN(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x0268:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzr> r3 = com.google.android.gms.ads.internal.client.zzr.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzr r3 = (com.google.android.gms.ads.internal.client.zzr) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzG(r3)
            r5.writeNoException()
            goto L_0x0324
        L_0x027b:
            com.google.android.gms.ads.internal.client.zzr r3 = r2.zzh()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzf(r5, r3)
            goto L_0x0324
        L_0x0287:
            r2.zzB()
            r5.writeNoException()
            goto L_0x0324
        L_0x028f:
            r5.writeNoException()
            goto L_0x0324
        L_0x0294:
            r2.zzZ()
            r5.writeNoException()
            goto L_0x0324
        L_0x029c:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x02a3
            goto L_0x02b5
        L_0x02a3:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzco
            if (r0 == 0) goto L_0x02b0
            com.google.android.gms.ads.internal.client.zzco r6 = (com.google.android.gms.ads.internal.client.zzco) r6
            goto L_0x02b5
        L_0x02b0:
            com.google.android.gms.ads.internal.client.zzcm r6 = new com.google.android.gms.ads.internal.client.zzcm
            r6.<init>(r3)
        L_0x02b5:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzH(r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x02bf:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x02c6
            goto L_0x02d8
        L_0x02c6:
            java.lang.String r6 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.ads.internal.client.zzbk
            if (r0 == 0) goto L_0x02d3
            com.google.android.gms.ads.internal.client.zzbk r6 = (com.google.android.gms.ads.internal.client.zzbk) r6
            goto L_0x02d8
        L_0x02d3:
            com.google.android.gms.ads.internal.client.zzbi r6 = new com.google.android.gms.ads.internal.client.zzbi
            r6.<init>(r3)
        L_0x02d8:
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            r2.zzE(r6)
            r5.writeNoException()
            goto L_0x0324
        L_0x02e2:
            r2.zzC()
            r5.writeNoException()
            goto L_0x0324
        L_0x02e9:
            r2.zzA()
            r5.writeNoException()
            goto L_0x0324
        L_0x02f0:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzm> r3 = com.google.android.gms.ads.internal.client.zzm.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzayv.zza(r4, r3)
            com.google.android.gms.ads.internal.client.zzm r3 = (com.google.android.gms.ads.internal.client.zzm) r3
            com.google.android.gms.internal.ads.zzayv.zzd(r4)
            boolean r3 = r2.zzad(r3)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L_0x0324
        L_0x0306:
            boolean r3 = r2.zzac()
            r5.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayv.zza
            r5.writeInt(r3)
            goto L_0x0324
        L_0x0313:
            r2.zzy()
            r5.writeNoException()
            goto L_0x0324
        L_0x031a:
            com.google.android.gms.dynamic.IObjectWrapper r3 = r2.zzo()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayv.zzg(r5, r3)
        L_0x0324:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbw.zzde(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
