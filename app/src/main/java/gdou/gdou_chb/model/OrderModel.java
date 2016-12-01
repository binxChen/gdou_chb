package gdou.gdou_chb.model;

import com.kymjs.rxvolley.client.HttpCallback;

import gdou.gdou_chb.data.bean.Orders;

/**
 * Created by WT on 2016/11/30.
 */

public interface OrderModel {
    /**
     * 客户下单
     * @param orders
     * @return
     */
    void placeOrder(Orders orders );

    /**
     * 用户完成订单
     * @param ordersId
     * @return
     */
    void doneOrders(long ordersId);

    /**
     * 用户申请退单
     * @param ordersId
     * @return
     */
    void rebackOrders(long ordersId );
}
