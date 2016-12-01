package gdou.gdou_chb.model;

/**
 * Created by WT on 2016/11/30.
 */

public interface ShopModel {
    /**
     * 商店列表
     * @param userId
     */
    void Shop(long userId);
    /**
     * 商家营业
     * @param userId
     * @return
     */
    void Online(long userId);

    /**
     * 商家休息
     * @param userId
     * @return
     */
    void OffLine(long userId);
}
