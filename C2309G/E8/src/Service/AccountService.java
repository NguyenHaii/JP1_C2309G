package Service;

import Entity.Account;
import Entity.Gender;
import Global.Global;
import IGeneric.IGeneral;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AccountService implements IGeneral<Account> {
    private List<Account> accounts;

    public AccountService(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccByCode(String code) {
        return accounts.stream()
                .filter(a -> a.getCustomer().getCode().equalsIgnoreCase(code))
                .collect(Collectors.toList());
    }

    public List<Account> getAccByName(String keyword) {
        return accounts.stream()
                .filter(a -> Global.ignoreCase(a.getCustomer().getName(), keyword)) // Sử dụng Global
                .collect(Collectors.toList());
    }

    public List<Account> getAccByCus() {
        return accounts.stream()
                .filter(a -> a.getCustomer().getGender() == Gender.M && a.getBalance() > 1_000_000)
                .collect(Collectors.toList());
    }

    public long countAccByCus() {
        return accounts.stream()
                .filter(a -> a.getCustomer().getGender() == Gender.F && a.getBalance() > 100_000)
                .count();
    }

    public Account getMaxBalance() {
        return accounts.stream()
                .filter(a -> a.getCustomer().getGender() == Gender.F)
                .max(Comparator.comparingDouble(Account::getBalance))
                .orElse(null);
    }

    @Override
    public Account getById(int id) {
        return accounts.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Account getByCode(String code) {
        return accounts.stream()
                .filter(a -> a.getAccountNumber().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Account> getByName(String keyword) {
        return accounts.stream()
                .filter(a -> Global.ignoreCase(a.getCustomer().getName(), keyword))
                .collect(Collectors.toList());
    }
}
