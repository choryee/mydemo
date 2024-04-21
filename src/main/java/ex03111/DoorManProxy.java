package ex03111;

public class DoorManProxy { // DoorMan.java내 매소드이외에 다른 매소드 추가하고 싶을때.

    private DoorMan doorMan;

    public DoorManProxy(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void remove(String bear) {
        doorMan.KickOut(bear);
    }

}
