//package ru.timokhina.lesson13;
//
//public class Mom {
//
//    public static void main(String[] args) throws AppleChildException, CarrotChildException, PorrigeChildException {
//        Mom mom = new Mom();
//        Child child = new Child();
//
//        child.eat(Food.APPLE);
//
//        while (true) {
//            Enum food;
//            try {
//                switch (food) {
//                    case Food.APPLE:
//                        throw new AppleChildException();
//                    case Food.CARROT:
//                        throw new CarrotChildException();
//                    case Food.PORRIGE:
//                        throw new PorrigeChildException();
//                }
//            } catch (AppleChildException a) {
//                throw new AppleChildException(a);
//                System.out.println("съел за обе щеки" + a.toString());
//            } catch (CarrotChildException c) {
//                throw new CarrotChildException(c);
//                System.out.println("Я не люблю морковь" + c.toString());
//            }catch(PorrigeChildException p) {
//                throw new PorrigeChildException(p);
//                System.out.println("Я не люблю кашу" + p.toString());
//                }
//            }
//        }
//
//
//    public void setChild(Child child) {
//        this.child = child;
//        child.eat(AppleChildException);
//        child.eat(CarrotChildException);
//        child.eat(PorrigeChildException);
//
//    }
//
//}
//}
