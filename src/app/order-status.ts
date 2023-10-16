export enum StatusCode{
    PEDNING="pending",TRANSIT="transit",COMPLETED="completed"
}
export interface OrderStatus {
    orderId:number,status:StatusCode;value:number;
}
