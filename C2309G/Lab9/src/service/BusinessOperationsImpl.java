package service;

import Interface.BusinessOperations;
import entity.Account;
import entity.Customer;
import entity.Invoice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class BusinessOperationsImpl<T> implements BusinessOperations<T> {

    @Override
    public void update(T obj) {
        System.out.println("Object updated: " + obj);
    }

    @Override
    public List<T> sort(List<T> list) {
        Collections.sort(list, Comparator.comparing(Object::toString));
        return list;
    }

    @Override
    public T findById(List<T> list, int id) {
        for (T obj : list) {
            if (obj instanceof Customer && ((Customer) obj).getId() == id) {
                return obj;
            } else if (obj instanceof Account && ((Account) obj).getId() == id) {
                return obj;
            } else if (obj instanceof Invoice && ((Invoice) obj).getId() == id) {
                return obj;
            }
        }
        return null;
    }

    @Override
    public T findByName(List<T> list, String name) {
        for (T obj : list) {
            if (obj instanceof Customer && ((Customer) obj).getName().equals(name)) {
                return obj;
            }
        }
        return null;
    }
}
