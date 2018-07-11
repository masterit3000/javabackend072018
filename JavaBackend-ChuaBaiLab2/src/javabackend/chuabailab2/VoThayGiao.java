/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend.chuabailab2;

/**
 *
 * @author Admin
 */
public class VoThayGiao {

    private static final boolean BAN = true;
    private static final boolean RANH = false;
    private int ma;
    private String ten;
    private boolean trangThai;

    private VoThayGiao() {
        this.trangThai = BAN;
    }

    private static VoThayGiao[] listObj = new VoThayGiao[3];

    public static VoThayGiao layVeObj() {
        for (int i = 0; i < listObj.length; i++) {

            if (listObj[i] == null) {
                listObj[i] = new VoThayGiao();
                return listObj[i];
            } else {
                if (!listObj[i].trangThai) {
                    listObj[i].trangThai = BAN;
                    return listObj[i];
                }
            }

        }
        return null;

    }
}

class BoThayGiao {

    private int ma;
    private String matkhau;
}
