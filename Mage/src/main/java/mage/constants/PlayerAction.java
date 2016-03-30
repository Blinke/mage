/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.constants;

/**
 * Defines player actions for a game
 *
 * @author LevelX2
 */
public enum PlayerAction {

    PASS_PRIORITY_UNTIL_MY_NEXT_TURN,
    PASS_PRIORITY_UNTIL_TURN_END_STEP,
    PASS_PRIORITY_UNTIL_NEXT_MAIN_PHASE,
    PASS_PRIORITY_UNTIL_NEXT_TURN,
    PASS_PRIORITY_UNTIL_STACK_RESOLVED,
    PASS_PRIORITY_UNTIL_END_STEP_BEFORE_MY_NEXT_TURN,
    PASS_PRIORITY_CANCEL_ALL_ACTIONS,
    TRIGGER_AUTO_ORDER_ABILITY_FIRST,
    TRIGGER_AUTO_ORDER_NAME_FIRST,
    TRIGGER_AUTO_ORDER_ABILITY_LAST,
    TRIGGER_AUTO_ORDER_NAME_LAST,
    TRIGGER_AUTO_ORDER_RESET_ALL,
    ROLLBACK_TURNS,
    UNDO,
    CONCEDE,
    MANA_AUTO_PAYMENT_ON,
    MANA_AUTO_PAYMENT_OFF,
    MANA_AUTO_PAYMENT_RESTRICTED_ON,
    MANA_AUTO_PAYMENT_RESTRICTED_OFF,
    RESET_AUTO_SELECT_REPLACEMENT_EFFECTS,
    REVOKE_PERMISSIONS_TO_SEE_HAND_CARDS,
    REQUEST_PERMISSION_TO_SEE_HAND_CARDS,
    REQUEST_PERMISSION_TO_ROLLBACK_TURN,
    ADD_PERMISSION_TO_SEE_HAND_CARDS,
    ADD_PERMISSION_TO_ROLLBACK_TURN,
    DENY_PERMISSON_TO_ROLLBACK_TURN,
    PERMISSION_REQUESTS_ALLOWED_ON,
    PERMISSION_REQUESTS_ALLOWED_OFF,
    REQUEST_AUTO_ANSWER_ID_YES,
    REQUEST_AUTO_ANSWER_ID_NO,
    REQUEST_AUTO_ANSWER_TEXT_YES,
    REQUEST_AUTO_ANSWER_TEXT_NO,
    REQUEST_AUTO_ANSWER_RESET_ALL,
    CLIENT_DOWNLOAD_SYMBOLS,
    CLIENT_DISCONNECT,
    CLIENT_QUIT_TOURNAMENT,
    CLIENT_QUIT_DRAFT_TOURNAMENT,
    CLIENT_CONCEDE_GAME,
    CLIENT_CONCEDE_MATCH,
    CLIENT_STOP_WATCHING,
    CLIENT_EXIT,
    CLIENT_REMOVE_TABLE,
    CLIENT_DOWNLOAD_CARD_IMAGES,
    CLIENT_RECONNECT,
    CLIENT_REPLAY_ACTION,

}
