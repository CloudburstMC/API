package org.cloudburstmc.api.event.player;

import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.api.locale.TextContainer;
import org.cloudburstmc.api.player.Player;

public final class PlayerKickEvent extends PlayerEvent implements Cancellable {

    public enum Reason {
        NEW_CONNECTION,
        KICKED_BY_ADMIN,
        NOT_WHITELISTED,
        IP_BANNED,
        NAME_BANNED,
        INVALID_PVE,
        LOGIN_TIMEOUT,
        SERVER_FULL,
        FLYING_DISABLED,
        UNKNOWN;

        @Override
        public String toString() {
            return this.name();
        }
    }

    protected TextContainer quitMessage;

    protected final Reason reason;
    protected final String reasonString;

    @Deprecated
    public PlayerKickEvent(Player player, String reason, String quitMessage) {
        this(player, Reason.UNKNOWN, reason, new TextContainer(quitMessage));
    }

    @Deprecated
    public PlayerKickEvent(Player player, String reason, TextContainer quitMessage) {
        this(player, Reason.UNKNOWN, reason, quitMessage);
    }

    public PlayerKickEvent(Player player, Reason reason, TextContainer quitMessage) {
        this(player, reason, reason.toString(), quitMessage);
    }

    public PlayerKickEvent(Player player, Reason reason, String quitMessage) {
        this(player, reason, new TextContainer(quitMessage));
    }

    public PlayerKickEvent(Player player, Reason reason, String reasonString, TextContainer quitMessage) {
        super(player);
        this.quitMessage = quitMessage;
        this.reason = reason;
        this.reasonString = reason.name();
    }

    public String getReason() {
        return reasonString;
    }

    public Reason getReasonEnum() {
        return this.reason;
    }

    public TextContainer getQuitMessage() {
        return quitMessage;
    }

    public void setQuitMessage(TextContainer quitMessage) {
        this.quitMessage = quitMessage;
    }

    public void setQuitMessage(String joinMessage) {
        this.setQuitMessage(new TextContainer(joinMessage));
    }
}
