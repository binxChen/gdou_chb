package gdou.gdou_chb.model;

import com.kymjs.rxvolley.client.HttpCallback;

import gdou.gdou_chb.model.bean.Address;

/**
 * Created by WT on 2016/11/30.
 */

public interface AddressModel {
    /**
     * 添加收货地址
     * @param address
     * @return
     */
    void addAddress(Address address);

    /**
     * 改变用户默认收货地址
     * @param addressId
     * @return
     */
    void changeDefault(long addressId);

    /**
     * 删除收货地址
     * @param addressId
     * @return
     */
    void delete(long addressId);

    /**
     * 查找指定用户的所有地址
     * @param userId
     * @return
     */
    void all(long userId,HttpCallback callback);

    /**
     * 查找指定用户的默认地址
     * @param userId
     * @return
     */
    void defalut(long userId,HttpCallback callback);

    /**
     * 修改收货地址
     * @param address
     * @return
     */
    void update(Address address,HttpCallback callback);

}
