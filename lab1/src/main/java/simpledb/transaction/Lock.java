package simpledb.transaction;

import simpledb.common.Permissions;

/**
 * @author zhangjiajun
 * @date 2022/12/6 10:01
 * @description
 */
public class Lock {
    private Permissions permissions;
    private TransactionId transactionId;

    public Lock(Permissions permissions, TransactionId transactionId) {
        this.permissions = permissions;
        this.transactionId = transactionId;
    }

    public TransactionId getTransactionId() {
        return transactionId;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Lock{" +
                "permissions=" + permissions +
                ", transactionId=" + transactionId +
                '}';
    }
}
